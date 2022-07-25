package leetcode.doublepointer.list;

/**
 * 234.回文链表
 *
 * 给你一个单链表的头节点 head ，请你判断该链表是否为回文链表。如果是，返回 true ；否则，返回 false 。
 **/
public class E_234 {
    public boolean isPalindrome(ListNode head) {
        ListNode slow,fast;
        slow=fast=head;
        //使slow指针指向链表中点
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        //如果fast指针没有指向空，说明链表是奇数,slow还得向前一步
        if(fast!=null){
            slow=slow.next;
        }


    }

    public static void main(String[] args) {
        ListNode l1_5 = new ListNode(2);
        ListNode l1_4 = new ListNode(5,l1_5);
        ListNode l1_3 = new ListNode(2,l1_4);
        ListNode l1_2 = new ListNode(3, l1_3);
        ListNode l1_1 = new ListNode(4, l1_2);
        ListNode head = new ListNode(1, l1_1);  //head 1 2 3 4
    }
}
