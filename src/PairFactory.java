
public interface PairFactory<K, V, R extends IPair<K, V>>{
	public R create(K key, V value);
}
