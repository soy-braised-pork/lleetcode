package leetcode.run.bank;

/**
 * 1541. 平衡括号字符串的最少插入次数
 * <p>
 * 给你一个括号字符串s，它只包含字符'(' 和')'。一个括号字符串被称为平衡的当它满足：
 * 任何左括号'('必须对应两个连续的右括号'))'。
 * 左括号'('必须在对应的连续两个右括号'))'之前。
 * 比方说"())"，"())(())))" 和"(())())))"都是平衡的，")()"，"()))" 和"(()))"都是不平衡的。
 * 你可以在任意位置插入字符 '(' 和 ')' 使字符串平衡。
 * 请你返回让 s 平衡的最少插入次数。。
 **/
public class M_1541 {


    public static int minInsertions(String s) {
        // need 是 ) 的需求数    res 是（ 的需求数
        int need = 0, res = 0;
        for (int i = 0; i < s.length(); i++) {
            // 一个 （ 需要 两个 ）匹配
            if (s.charAt(i) == '(') {
                need += 2;
                //奇数个 )
                if(need % 2==1){
                    res++;
                    need--;
                }
            }

            if (s.charAt(i) == ')') {
                need--;
                // 说明有一个多余的 ) ,需要插入一个左括号
                if (need==-1){
                    res++;
                    need=1;
                }
            }
        }
        return res + need;
    }

    public static void main(String[] args) {
        String s = "())";
        minInsertions(s);
    }
}
