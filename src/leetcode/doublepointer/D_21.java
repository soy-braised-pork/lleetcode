package leetcode.doublepointer;

import java.util.ArrayList;
import java.util.List;

/**
 * 23、合并k个升序链表
 *
 * 给你一个链表数组，每个链表都已经按升序排列。
 * 请你将所有链表合并到一个升序链表中，返回合并后的链表
 */
public class D_21 {
    public static ListNode mergeKLists(ListNode[] lists) {
        ListNode dummy = new ListNode(-1);

        return dummy.next;
    }

    public static void main(String[] args) {
        ListNode l1_2 = new ListNode(4);
        ListNode l1_1 = new ListNode(2);
        ListNode list1 = new ListNode();

        ListNode l2_2 = new ListNode(4);
        ListNode l2_1 = new ListNode(3,l2_2);
        ListNode list2 = new ListNode();

        ListNode list3 = new ListNode();

        List<Short> objects = new ArrayList<>();

//        System.out.println(mergeKLists(list3));
    }
}
