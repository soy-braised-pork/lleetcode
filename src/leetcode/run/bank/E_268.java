package leetcode.run.bank;


/**
 * 给定一个包含 [0, n] 中 n 个数的数组 nums ，找出 [0, n] 这个范围内没有出现在数组中的那个数。
 **/
public class E_268 {

    public static int missingNumber(int[] nums) {
        int n = nums.length;
        //求和公式  （首项+尾项）* 项数 / 2
        // 因为缺少一个数，n+1
        long indexSum = (long) (0 + n) * (n + 1) / 2;
        long numsSum=0;
        for(int i:nums){
            numsSum+=i;
        }
        return (int) (indexSum-numsSum);
    }

    /**
     * index    0 1 2
     * nums     0 2 3
     *
     * 索引补一位：
     * index    0   1   2  '4'
     * nums     0       2   3
     */
    public static void main(String[] args) {
        int nums[] = {0, 3, 2};
        System.out.println(missingNumber(nums));

    }
}
