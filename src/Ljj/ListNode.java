package Ljj;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @ClassName ListNode
 * @Description Convert Integer[] to List
 * @Author LiuJing
 * @Date 2018/11/30 15:34
 * @Version 1.0
 **/
public class ListNode {
    int val;
    ListNode next;
    public ListNode(int val){
        this.val = val;
    }
    public ListNode(){

    }
    public ListNode create(Integer[] array){
        if(array == null || array.length == 0)
            return null;
        ListNode listNode = new ListNode(0);
        ListNode l = listNode;
        for(int i = 0;i < array.length;i++){
            l.next = new ListNode(array[i]);
            l = l.next;
        }
        return listNode.next;
    }
    public void read(ListNode node){
        while(node != null){
            System.out.print(node.val + ",");
            node = node.next;
        }
        System.out.println();
    }
}
