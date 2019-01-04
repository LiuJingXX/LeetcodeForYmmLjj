package Ljj;

/**
 * @ClassName L147_InsertionSortList
 * @Description 插入排序的动画演示如上。从第一个元素开始，该链表可以被认为已经部分排序（用黑色表示）。
 * 每次迭代时，从输入数据中移除一个元素（用红色表示），并原地将其插入到已排好序的链表中。
 * @Author LiuJJ
 * @Date 2019/1/4 9:25
 * @Version 1.0
 **/
public class L147_InsertionSortList {
    public static ListNode insertionSortList(ListNode head) {
        if(head == null){
            return null;
        }
        ListNode pre = new ListNode(0);
        pre.next = new ListNode(head.val);
        ListNode cur = pre;
        head = head.next;
        while(head != null){
            ListNode tmp = new ListNode(head.val);
            while(cur.next != null && tmp.val > cur.next.val ){
                cur = cur.next;
            }
            if(cur.next == null){
                cur.next = tmp;
            }else{
                tmp.next = cur.next;
                cur.next = tmp;
            }
            cur = pre;
            head = head.next;
        }
        return pre.next;
    }

    public static void main(String[] args) {
        ListNode node = new ListNode();
        Integer[] test = new Integer[]{-1,5,3,4,0};
        ListNode node1 = node.create(test);
        node.read(node1);
        node.read(insertionSortList(node1));
    }
}
