package Ymm;

public class MergeTwoSortedLists {
    public static class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode t;
        t=head;
        if(l1==null) return l2;
        if(l2==null) return l1;
        while(l1!=null&&l2!=null){
            ListNode tmp;
            if(l1.val<=l2.val){
                tmp = new ListNode(l1.val);
                l1 = l1.next;
            }else{
                tmp =new ListNode(l2.val);
                l2=l2.next;
            }
            t.next = tmp;
            t = t.next;
        }
        if(l1!=null) t.next=l1;
        else if(l2!=null) t.next=l2;
        return head.next;
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
        int[] num1={1,2,3};
        int[] num2={1,2,4};
        ListNode l1 = arraytolist(num1);
        ListNode l2= arraytolist(num2);
        //System.out.println(mergeTwoLists(l1,l2));
        ListNode l=mergeTwoLists(l1,l2);
        while(l!=null){
            System.out.println(l.val);
            l=l.next;
        }

    }
}
