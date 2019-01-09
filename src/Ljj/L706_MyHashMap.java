package Ljj;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName L706_MyHashMap
 * @Description 不使用任何内建的哈希表库设计一个哈希映射
 * @Author LiuJJ
 * @Date 2019/1/4 23:49
 * @Version 1.0
 **/
public class L706_MyHashMap {
    private List<Integer> keyList = new ArrayList<>();
    private List<Integer> valueList = new ArrayList<>();
    public L706_MyHashMap() {

    }

    /** value will always be non-negative. */
    public void put(int key, int value) {
        if(keyList.contains(key)){
            for(int i = 0;i < keyList.size();i++){
                if(keyList.get(i) == key){
                    valueList.set(i,value);
                    break;
                }
            }
        }else{
            keyList.add(key);
            valueList.add(value);
        }
    }

    /** Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key */
    public int get(int key) {
        for(int i = 0;i < keyList.size();i++){
            if(keyList.get(i) == key){
                return valueList.get(i);
            }
        }
        return -1;
    }

    /** Removes the mapping of the specified value key if this map contains a mapping for the key */
    public void remove(int key) {
        for(int i = 0;i < keyList.size();i++){
            if(keyList.get(i) == key){
                valueList.remove(i);
                keyList.remove(i);
                break;
            }
        }
    }

    public static void main(String[] args) {
        L706_MyHashMap hashMap = new L706_MyHashMap();
        hashMap.put(1,1);
        hashMap.put(2,2);
        System.out.println(hashMap.get(1));
        System.out.println(hashMap.get(3));
        hashMap.put(2, 1);
        System.out.println(hashMap.get(2));
        hashMap.remove(2);
        System.out.println(hashMap.get(2));
    }
}
