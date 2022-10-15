package leetcode.run.bank;

/**
 * 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
 **/
public class E_136 {

    /**
     * 异或     相同为0，不同为1
     * a^a=0  a^0=a
     * 成对的数异或是0；落单的数与0异或还是它自身
     */
    public static int singleNumber(int[] nums) {
        int res = 0;
        for (int n : nums) {
            res = res ^ n;
        }
        return res;
    }


    public static void main(String[] args) {
        int nums[] = {2, 3, 2};
        singleNumber(nums);
    }
}
