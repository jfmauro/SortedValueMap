import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class SortedMap <K, V>{
	private Map<K, IPair<K, V>> map;
	private PairFactory<K, V, ? extends IPair<K, V>> factory;
	
	public SortedMap(PairFactory<K, V, ? extends IPair<K, V>> factory){
		this.factory = factory;
		map = new HashMap<K, IPair<K, V>>();
	}

	public IPair<K, V> put(K key, V value) {
		return map.put(key, factory.create(key, value));
		//return map.put(key, new Pair<K, V>(key, value));
		//http://stackoverflow.com/questions/75175/create-instance-of-generic-type-in-java
	}
	
	public List<IPair<K, V>> sortByValue(){
		List<IPair<K, V>> l = new ArrayList<IPair<K, V>>(map.values());
		Collections.sort(l);
		return l;
	}
	
	
}
