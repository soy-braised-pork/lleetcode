package leetcode.run.bank;

import java.util.Stack;

/**
 * 20. 有效的括号
 *
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']'的字符串 s ，判断字符串是否有效。
 * 有效字符串需满足：
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 * 每个右括号都有一个对应的相同类型的左括号。
 **/
public class E_20 {

    public static boolean isValid(String s) {
        Stack<Character> left = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                left.push(c);
                //字符 c 是 右括号
            } else if (!left.isEmpty() && leftOf(c) == left.peek()) {
                left.pop();
            } else {
                return false;
            }
        }
        //是否所有的 左括号 都被匹配了
        return left.isEmpty();
    }

    static char leftOf(char c) {
        if (c == '}') {
            return '{';
        }
        if (c == ')') {
            return '(';
        }
        return '[';
    }

    public static void main(String[] args) {
        String s = "}{";
        isValid(s);
    }
}
