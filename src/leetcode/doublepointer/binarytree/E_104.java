package leetcode.doublepointer.binarytree;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author zhulx
 *二叉树的最大深度
 *
 *给定一个二叉树，找出其最大深度。二叉树的深度为根节点到最远叶子节点的最长路径上的节点数。
 *说明: 叶子节点是指没有子节点的节点。
 **/
public class E_104 {

    /* 动态规划 */
    //输入一个节点，返回以该节点为根的二叉树最大深度
    public int maxDepth(TreeNode root) {
        if (root ==null){
            return 0;
        }
        int leftMax=maxDepth(root.left);
        int rightMax=maxDepth(root.right);
        //根据左右子树最大深度，算出二叉树最大深度
        return 1+Math.max(leftMax,rightMax);
    }


    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;


            ReentrantLock reentrantLock = new ReentrantLock();
            reentrantLock.lock();
            reentrantLock.unlock();

        }
    }


    public static void main(String[] args) {

    }
}
