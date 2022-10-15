package leetcode.run.bank;

/**
 * 编写一个函数，输入是一个无符号整数（以二进制串的形式），返回其二进制表达式中数字位数为 '1' 的个数（也被称为汉明重量）。
 **/
public class E_191 {

    /**
     * & 与 有0则为0
     *
     * n & (n - 1) 可以消除最后一个 1
     */
    public static int hammingWeight(int n) {
        int res = 0;
        while (n != 0) {
            n = n & (n - 1);
            res++;
        }
        return res;
    }

    public static void main(String[] args) {
        int n = 0000001001;
        hammingWeight(n);
    }
}
