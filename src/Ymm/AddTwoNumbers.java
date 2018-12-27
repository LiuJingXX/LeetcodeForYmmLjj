package Ymm;

public class AddTwoNumbers {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
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

   public static ListNode reverselist(ListNode l){
        ListNode head=new ListNode(0);
        while(l!=null){
            ListNode p=new ListNode(l.val);
            p.next=head.next;
            head.next=p;
            l=l.next;
        }
        return head.next;
    }
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        //l1=reverselist(l1);
        //l2=reverselist(l2);
        int count=0;
        ListNode head = new ListNode(0);
        ListNode p;
        p=head;
        while (l1!=null&&l2!=null){
            ListNode tmp=new ListNode(l1.val+l2.val+count);
            if(tmp.val>=10){
                count=1;
                tmp.val=tmp.val%10;
            }
            else count=0;
            p.next=tmp;
            p=p.next;
            l1=l1.next;
            l2=l2.next;
        }
        if(count==1&&l1==null&&l2==null){
            ListNode tmp=new ListNode(1);
            p.next=tmp;
        }
        else if(l1!=null){
        while(l1!=null) {
            ListNode tmp = new ListNode(l1.val + count);
            if (tmp.val >= 10) {
                count = 1;
                tmp.val = tmp.val % 10;
            } else count = 0;
            p.next = tmp;
            p = p.next;
            l1 = l1.next;
          }
        }
        else if(l2!=null){
            while (l2!=null){
                ListNode tmp =new ListNode(l2.val+count);
                if(tmp.val>=10){
                    count=1;
                    tmp.val%=10;
                }
                else count=0;
                p.next=tmp;
                p=p.next;
                l2=l2.next;
            }
        }
        if(count==1){
            ListNode tmp=new ListNode(1);
            p.next=tmp;
        }
        //ListNode l=reverselist(head.next);
        //return l;
        return head.next;
    }

    public static void main(String[] args) {
        int[] n1={1};
        int[] n2={9,9};
        ListNode l1=arraytolist(n1);
        ListNode l2=arraytolist(n2);
        ListNode l=addTwoNumbers(l1,l2);
        while(l!=null){
            System.out.println(l.val);
            l=l.next;
        }
    }
}

