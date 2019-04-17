package Ljj.practice;

import com.sun.scenario.effect.impl.prism.PrImage;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName LRU1
 * @Description TODO
 * @Author LiuJJ
 * @Date 2019/3/18 21:52
 * @Version 1.0
 **/
public class LRU1 {
    private class Node{
        Node prev;
        Node next;
        int key;
        int value;
        public Node(int key,int value){
            this.key = key;
            this.value = value;
            this.next = null;
            this.prev = null;
        }
    }
    private int capacity;
    private HashMap<Integer,Node> map = new HashMap<>();
    private Node head = new Node(-1,-1);
    private Node tail = new Node(-1,-1);

    public LRU1(int capacity){
        this.capacity = capacity;
        this.head.next = this.tail;
        this.tail.prev = this.head;
    }
    public int get(int key){
        if(!map.containsKey(key)){
            return -1;
        }
        Node cur = map.get(key);
        cur.prev.next =cur.next;
        cur.next.prev = cur.prev;
        moveToTail(cur);
        return map.get(key).value;
    }
    public void set(int key,int value){
        if(get(key) != -1){
            map.get(key).value = value;
            return;
        }
        if(map.size() == capacity){
            map.remove(head.next.key);
            head.next = head.next.next;
            head.next.prev = head;
        }
        Node insert = new Node(key,value);
        map.put(key,insert);
        moveToTail(insert);
    }
    private void moveToTail(Node node){
        tail.prev.next = node;
        node.next = tail;
        node.prev =tail.prev;
        tail.prev = node;
    }
    public void print(){
        for(Map.Entry<Integer,Node> entry:map.entrySet()){
            System.out.print(entry.getValue().value + "--");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LRU1 r = new LRU1(3);
        r.set(1,3);
        r.set(2,4);
        r.set(1,5);
        r.set(3,6);
        r.set(4,7);
        r.print();
    }
}
