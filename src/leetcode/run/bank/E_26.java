package leetcode.run.bank;

/**
 * 26、删除有序数组中的重复项
 **/
public class E_26 {

    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int need = 0, pre = 1;
//        for(int i=1;i<nums.length;i++) {   增加内存
        while (pre < nums.length) {
            if (nums[need] != nums[pre]) {
                need++;
                nums[need] = nums[pre];
            }
            pre++;
        }
//        return need + 1;
        return ++need;

    }


    public static void main(String[] args) {
        int[] nums = {1, 1, 2};
        removeDuplicates(nums);
    }
}
