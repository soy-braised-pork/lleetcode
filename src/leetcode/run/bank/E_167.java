package leetcode.run.bank;

/**
 * 167. 两数之和 II - 输入有序数组
 **/
public class E_167 {
    public static int[] twoSum(int[] numbers, int target) {
        //左右指针
        int left = 0, right = numbers.length - 1;
        while (left < right) {
            int sum = numbers[left] + numbers[right];
            //移动左右指针
            if (target > sum) {
                left++;
            } else if (target < sum) {
                right--;
            } else {
                return new int[]{left+1, right+1};
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int numbers[] = {2, 7, 11, 15};
        int target = 9;
        twoSum(numbers, target);
    }
}
