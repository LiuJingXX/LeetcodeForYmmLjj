package Ymm;

/**
 * @ClassName SwapNodesinPairs
 * @Description 给定一个链表，两两交换其中相邻的节点，并返回交换后的链表。给定 1->2->3->4, 你应该返回 2->1->4->3
 * @Author manyu
 * @Date 2019/1/3 19:46
 * @Version 1.0
 **/
public class SwapNodesinPairs {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public static ListNode swapPairs(ListNode head) {
        if(head==null||head.next==null) return head;
        ListNode thead=new ListNode(0);
        thead.next=head;
        ListNode l1=thead;
        ListNode l2=head;
        ListNode tmp;
        while (l2!=null&&l2.next!=null){
            tmp=l2.next;
            l2.next=tmp.next;
            tmp.next=l2;
            l1.next=tmp;
            l1=l2;
            l2=l2.next;
        }
        return thead.next;
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
        int[] n={1,2,3,4,5};
        ListNode head=arraytolist(n);
        ListNode nh=swapPairs(head);
        while(nh!=null){
            System.out.println(nh.val);
            nh=nh.next;
        }
    }
}
