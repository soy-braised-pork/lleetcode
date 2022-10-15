package leetcode.run.bank;


/**
 * 160.相交链表
 * <p>
 * 给你两个单链表的头节点 headA 和 headB ，请你找出并返回两个单链表相交的起始节点。如果两个链表不存在相交节点，返回 null 。
 **/
public class E_160 {

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        //p1 指向 链表A 头结点；p2 指向 链表B 头结点
        ListNode p1 = headA, p2 = headB;
        while (p1 != p2) {
            //p1 走一步 ，如果到链表末尾，转向 链表B
            if (p1 == null) {
                p1 = headB;
            } else {
                p1 = p1.next;
            }
            if (p2 == null) {
                p2 = headA;
            } else {
                p2 = p2.next;
            }
        }
        return p1;
    }

    public static void main(String[] args) {
        //1,2,4
        ListNode l1_2 = new ListNode(4);
        ListNode l1_1 = new ListNode(2, l1_2);
        ListNode list1 = new ListNode(1, l1_1);
        //1,3
        ListNode l2_1 = new ListNode(3);
        ListNode list2 = new ListNode(1, l2_1);
        System.out.println(getIntersectionNode(list1, list2));

    }
}


class ListNode {
    int val;
    ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    @Override
    public String toString() {
//        return "ListNode{" +
//                "val=" + val +
//                ", next=" + next +
//                '}';
        return val + "," + next;
    }
}
