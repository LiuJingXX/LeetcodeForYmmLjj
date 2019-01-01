package Ymm;

import java.util.List;

/**
 * @ClassName RemoveNthNodeFromEndofList
 * @Description 给定一个链表，删除链表的倒数第 n 个节点，并且返回链表的头结点。
 * @Author manyu
 * @Date 2019/1/1 19:45
 * @Version 1.0
 **/
public class RemoveNthNodeFromEndofList {
    public static class ListNode{
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode p;
        p=head;
        int len=0;
        int count=0;
        while(p!=null){
            len++;
            p=p.next;
        }
        if(len-n==0){
            ListNode q;
            q=head.next;
            return q;
        }
        p=head;
        while (count!=len-n-1){
           count++;
           p=p.next;
        }
        ListNode q;
        q=p.next.next;
        p.next=q;
        return head;
    }

    public static ListNode arraytolist(int[] array){
        ListNode l=new ListNode(0);
        ListNode t;
        t=l;
        for(int i=0;i<array.length;i++){

            t.next=new ListNode(array[i]);
            t=t.next;
        }
        return l.next;
    }

    public static void main(String[] args) {
        int num[]={1,2};
        ListNode l=arraytolist(num);
        System.out.println(removeNthFromEnd(l,2));
    }
}
