package leetcode.run.bank;

import leetcode.run.binarytree.E_104.TreeNode;

/**
 * 给定一个二叉树，找出其最小深度。
 * 最小深度是从根节点到最近叶子节点的最短路径上的节点数量。
 * 说明：叶子节点是指没有子节点的节点。
 **/
public class E_111 {
    public static int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int m1 = minDepth(root.right);
        int m2 = minDepth(root.left);
        // 如果左右节点有一个为空 返回 m1+m2+1
        // 如果左右节点都不为空，返回 最小深度+1
        return root.right == null || root.left == null ? m1 + m2 + 1 : Math.min(m1, m2) + 1;
    }


    public static void main(String[] args) {
        //   3
        //   / \
        //  9  20
        //    /  \
        //   15   7
        TreeNode treeNode4 = new TreeNode(15);
        TreeNode treeNode5 = new TreeNode(17);
        TreeNode treeNode3 = new TreeNode(20, treeNode4, treeNode5);
        TreeNode treeNode2 = new TreeNode(9);
        TreeNode treeNode1 = new TreeNode(3, treeNode2, treeNode3);
        System.out.println(minDepth(treeNode1));
    }
}
