package leetcode.run.bank;

/**
 * 283、移动0
 * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 * 请注意 ，必须在不复制数组的情况下原地对数组进行操作。
 **/
public class E_283 {

    public static void moveZeroes(int[] nums) {
        // 去除 nums 中的所有 0
        // 返回去除 0 之后的数组长度
        int temp = removeElement(nums, 0);
        // 将 p 之后的所有元素赋值为 0
        for (; temp < nums.length; temp++) {
            nums[temp] = 0;
        }
    }

    public static int removeElement(int[] nums, int val) {
        int slow = 0, fast = 1;
        while (fast < nums.length) {
            if (nums[fast] != 0) {
                nums[slow] = nums[fast];
                slow++;
            }
            fast++;
        }
        return slow;
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        moveZeroes(nums);
    }
}
