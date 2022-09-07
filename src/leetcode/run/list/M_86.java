package leetcode.run.list;


/**
 * 86. 分隔链表
 * <p>
 * 给你一个链表的头节点 head 和一个特定值 x ，请你对链表进行分隔，使得所有 小于 x 的节点都出现在 大于或等于 x 的节点之前。
 * 你应当 保留 两个分区中每个节点的初始相对位置。
 */
class M_86 {

    public static ListNode partition(ListNode head, int x) {
        ListNode lessNode = new ListNode(-1);
        ListNode moreNode = new ListNode(-1);
        //p1 p2 指针负责生成结果链表
        ListNode p1 = lessNode, p2 = moreNode;
        //p 负责遍历原链表
        ListNode p = head;
        while (p != null) {
            if (p.val >= x) {
                p2.next = p;
                p2 = p2.next;
            } else {
                p1.next = p;
                p1 = p1.next;
            }
            //断开原链表中的每个节点的 next 指针 !!!!!!!!!!!!!!!
            ListNode temp = p.next;
            p.next = null;
            p = temp;
        }

//        lessNode.next = moreNode.next;
        p1.next = moreNode.next;
        return lessNode.next;
    }

    public static void main(String[] args) {
        ListNode l1_5 = new ListNode(2);
        ListNode l1_4 = new ListNode(5,l1_5);
        ListNode l1_3 = new ListNode(2,l1_4);
        ListNode l1_2 = new ListNode(3, l1_3);
        ListNode l1_1 = new ListNode(4, l1_2);
        ListNode head = new ListNode(1, l1_1);  //head 1 2 3 4
        int x = 3;
        System.out.println(partition(head, x));
    }
}

