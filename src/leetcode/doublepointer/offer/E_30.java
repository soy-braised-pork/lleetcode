package leetcode.doublepointer.offer;

import java.util.Stack;

/**
 * @author zhulx
 *
 * 包含min函数的栈
 * 定义栈的数据结构，请在该类型中实现一个能够得到栈的最小元素的 min 函数在该栈中，调用 min、push 及 pop 的时间复杂度都是 O(1)。
 **/
public class E_30 {

    static Stack<Integer> A, B;

    public static void MinStack() {
        A = new Stack<Integer>();
        B = new Stack<Integer>();
    }

    public static void push(int x) {
        //将 x 压入栈 A
        A.add(x);
        //栈 B 为空 ｜｜  x <= B 的栈顶元素     ===> 保证栈 B 的升序排列
        if (B.empty() || B.peek() >= x) {
            B.add(x);
        }
    }

    //保证栈 A B 的一致性
    public static void pop() {
        if (A.pop().equals(B.peek())) {
            B.pop();
        }
    }

    public static int top() {
        return A.peek();
    }

    public static int min() {
        return B.peek();
    }

    public static void main(String[] args) {
        MinStack();
        push(5);
        push(1);
        push(7);
        top();
        min();
        pop();
    }
}
