package Ljj.practice;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @ClassName LRU
 * @Description LRU based on HashMap and DoubleLinkedList
 * @Author LiuJJ
 * @Date 2019/3/18 21:13
 * @Version 1.0
 **/
public class LRU<K,V> {
    private LinkedHashMap<K,V> map;
    private int cacheSize;
    private static final float hashLoadFactory = 0.75f;

    public LRU(int cacheSize){
        this.cacheSize = cacheSize;
        int capacity = (int)Math.ceil(cacheSize/hashLoadFactory) + 1;
        map = new LinkedHashMap<K,V>(capacity,hashLoadFactory,true){
            private static final long serialVersionUID = 1;

            @Override
            protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
                return size() > LRU.this.cacheSize;
            }
        };
    }
    public synchronized V get(K key){
        return map.get(key);
    }
    public synchronized void put(K key,V value){
        map.put(key,value);
    }
    public synchronized void clear(){
        map.clear();
    }
    public synchronized int usedSize(){
        return map.size();
    }
    public void print(){
        for(Map.Entry<K,V> entry:map.entrySet()){
            System.out.print(entry.getValue() + "--");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LRU<Integer,Integer> r = new LRU<>(3);
        r.put(1,3);
        r.put(2,4);
        r.put(1,3);
        r.put(3,5);
        r.put(4,6);
        r.print();
    }
}
