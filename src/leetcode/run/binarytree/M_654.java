package leetcode.run.binarytree;

/**
 * @author zhulx
 * 654、最大二叉树
 * <p>
 * 给定一个不重复的整数数组nums 。最大二叉树可以用下面的算法从nums 递归地构建:
 * <p>
 * 创建一个根节点，其值为nums 中的最大值。
 * 递归地在最大值左边的子数组前缀上构建左子树。
 * 递归地在最大值 右边 的子数组后缀上构建右子树。
 * 返回nums 构建的 最大二叉树 。
 * <p>
 * 输入：nums = [3,2,1,6,0,5]
 * 输出：[6,3,5,null,2,0,null,null,1]
 **/
public class M_654 {
    public static E_104.TreeNode constructMaximumBinaryTree(int[] nums) {
        return build(nums, 0, nums.length - 1);
    }

    static E_104.TreeNode build(int[] nums, int lo, int hi) {
        if (lo > hi) {
            return null;
        }
        //找到数组中的最大值和对应的索引
        int index = -1, maxValue = Integer.MIN_VALUE;
        for (int i = lo; i <= hi; i++) {
            if (maxValue < nums[i]) {
                index = i;
                maxValue = nums[i];
            }
        }
        E_104.TreeNode root = new E_104.TreeNode();
        //递归调用构造左右子树
        root.left = build(nums, lo, index - 1);
        root.right = build(nums, lo, index - 1);
        return root;
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 1, 6, 0, 5};
        constructMaximumBinaryTree(nums);
    }
}
