package leetcode.doublepointer.binarytree;

/**
 * @author zhulx
 * 543.二叉树的直径
 * 给定一棵二叉树，你需要计算它的直径长度。一棵二叉树的直径长度是任意两个结点路径长度中的最大值。这条路径可能穿过也可能不穿过根结点。
 **/
public class E_543 {
    private static int maxDiameter=0;

    public static int diameterOfBinaryTree(E_104.TreeNode root) {
        maxDepth(root);
        return maxDiameter;
    }

    static int maxDepth(E_104.TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftMax=maxDepth(root.left);
        int rightMax=maxDepth(root.right);
        maxDiameter=Math.max(maxDiameter,leftMax+rightMax);
        return 1+Math.max(leftMax,rightMax);
    }

    public static void main(String[] args) {
        //   3
        //   / \
        //  9  20
        //    /  \
        //   15   7
        E_104.TreeNode treeNode4 = new E_104.TreeNode(15);
        E_104.TreeNode treeNode5 = new E_104.TreeNode(17);
        E_104.TreeNode treeNode3 = new E_104.TreeNode(20, treeNode4, treeNode5);
        E_104.TreeNode treeNode2 = new E_104.TreeNode(9);
        E_104.TreeNode treeNode1 = new E_104.TreeNode(3, treeNode2, treeNode3);
        System.out.println(diameterOfBinaryTree(treeNode1));
    }
}
