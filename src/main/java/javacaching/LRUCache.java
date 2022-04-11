package javacaching;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache<K, V> extends LinkedHashMap<K,V> {
    private int size;

    public LRUCache(int size) {
        super(size, 0.75f, true);
        this.size=size;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry eldest) {
        return size() > size;

    }

    public static LRUCache newInstance(int size ){
      return new LRUCache(size);
    }

    public static void main(String[] args) {
        LRUCache<String,Integer> lru= LRUCache.newInstance(3);
        lru.put("sanjeev",1);
        lru.put("rahul",2);
        lru.put("arya",3);
        lru.put("jack",4);
        lru.get("arya");
        lru.put("sanjeev",9);
        lru.get("arya");
        lru.put("rupam",13);
        lru.get("arya");


        System.out.println("least recently used case is "+lru);
    }
}
