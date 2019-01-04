package Ljj;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @ClassName L146_LRUCache
 * @Description 运用你所掌握的数据结构，设计和实现一个  LRU (最近最少使用) 缓存机制。它应该支持以下操作： 获取数据 get 和 写入数据 put 。
 * @Author LiuJJ
 * @Date 2019/1/4 16:21
 * @Version 1.0
 **/
public class L146_LRUCache {
    private LRU cache;
    public L146_LRUCache(int capacity){
        this.cache = new LRU(capacity);

    }
    public int get(int key) {
        if(cache.containsKey(key)){
            return cache.get(key);
        }
        return -1;
    }

    public void put(int key, int value) {
        cache.put(key,value);
    }
    class LRU extends LinkedHashMap<Integer,Integer>{
        int capacity;
        public LRU(int capacity){
            super(capacity,0.75f,true);
            this.capacity = capacity;
        }

        @Override
        protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
            return this.size() > capacity;
        }
    }

    public static void main(String[] args) {
        L146_LRUCache test = new L146_LRUCache(2);
        test.put(1,1);
        test.put(2,2);
        System.out.println(test.get(1));
        test.put(3,3);
        System.out.println(test.get(2));
        test.put(4, 4);
        System.out.println(test.get(1));
        System.out.println(test.get(3));
        System.out.println(test.get(4));
    }
}
