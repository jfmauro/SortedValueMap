

public abstract class Pair<K,V> implements IPair<K,V>{
	private K key;
	private V value;
	
	public Pair(K key, V value) {
		super();
		this.key = key;
		this.value = value;
	}

	@Override
	public K getKey() {		
		return key;
	}

	@Override
	public V getValue() {		
		return value;
	}
}
