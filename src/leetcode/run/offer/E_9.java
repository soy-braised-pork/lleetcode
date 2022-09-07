package leetcode.run.offer;


import java.util.LinkedList;

/**
 * @author zhulx
 *
 *
 * 用两个栈实现一个队列。
 * 队列的声明如下，请实现它的两个函数 appendTail 和 deleteHead ，分别完成在队列尾部插入整数和在队列头部删除整数的功能。(若队列中没有元素，deleteHead 操作返回 -1 )
 **/
public class E_9 {

    private static LinkedList<Integer> A,B;

    public static void CQueue() {
        A = new LinkedList<Integer>();
        B = new LinkedList<Integer>();
    }

    public static void appendTail(int value) {
        A.addLast(value);
    }

    public static int deleteHead() {
        //1、当栈B不为空，B中仍有完成倒序的元素，返回B栈顶元素
        if(!B.isEmpty()){
            return B.removeLast();
        }
        //2、栈A为空，两个栈都为空，返回-1
        if (A.isEmpty()) {
            return -1;
        }
        //3、栈A不为空，将元素压入栈B，实现元素倒序，并返回B栈顶元素
        while (!A.isEmpty()){
            B.addLast(A.removeLast());
        }
        return B.removeLast();
    }


    public static void main(String[] args) {
        CQueue();
        appendTail(5);
        appendTail(4);
        appendTail(3);
        appendTail(2);
        appendTail(1);
        deleteHead();

    }
}
