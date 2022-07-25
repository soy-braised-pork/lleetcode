package leetcode.doublepointer.list;

/**
 * 21.合并两个有序链表
 * <p>
 * 将两个升序链表合并为一个新的 升序 链表并返回。
 * 新链表是通过拼接给定的两个链表的所有节点组成的。
 */

class e_21 {

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        //虚拟头节点
        ListNode dummy = new ListNode(-1), p = dummy;
        ListNode p1 = list1, p2 = list2;

        while (p1 != null && p2 != null) {
            //比较 p1 和 p2 俩个指针
            //将值较小的节点接到 p 指针
            if (p1.val > p2.val) {
                p.next = p2;
                p2 = p2.next;
            } else {
                p.next = p1;
                p1 = p1.next;
            }
            // p 指针不断前进
            p = p.next;
        }
        if (p1 != null) {
            p.next = p1;
        }
        if (p2 != null) {
            p.next = p2;
        }
        return dummy.next;
    }

    public static void main(String[] args) {
//        ListNode l1_2 = new ListNode(4);
//        ListNode l1_1 = new ListNode(2);
        ListNode list1 = new ListNode();

//        ListNode l2_2 = new ListNode(4);
//        ListNode l2_1 = new ListNode(3,l2_2);
        ListNode list2 = new ListNode();

        System.out.println(mergeTwoLists(list1, list2));
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
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
