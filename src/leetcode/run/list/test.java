package leetcode.run.list;

/**
 * @author zhulx
 * 使用递归，倒序打印链表
 *
 **/
public class test {
    static void traverse(ListNode head) {
        if (head == null) {
            return;
        }
        //递归的堆栈
        traverse(head.next);
        System.out.print( head.val + "，");
    }


    public static void main(String[] args) {
        ListNode l1_5 = new ListNode(2);
        ListNode l1_4 = new ListNode(5, l1_5);
        ListNode l1_3 = new ListNode(2, l1_4);
        ListNode l1_2 = new ListNode(3, l1_3);
        ListNode l1_1 = new ListNode(4, l1_2);
        ListNode head = new ListNode(1, l1_1);  //head 1 2 3 4
        System.out.println(head);
        System.out.print("倒序打印链表：");
        traverse(head);
    }
}
