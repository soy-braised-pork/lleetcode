package leetcode.doublepointer.binarytree;

import java.util.LinkedList;
import java.util.List;

/**
 * @author zhulx
 * <p>
 * 二叉树的前序遍历
 * 给你二叉树的根节点 root ，返回它节点值的 前序 遍历。
 **/
public class E_144 {
    public static List<Integer> preorderTraversal(E_104.TreeNode root) {
        final LinkedList<Integer> res = new LinkedList<>();
        if (root == null) {
            return res;
        }
        //二叉树前序遍历结果：根节点 + 左子树前序 + 右子树前序遍历
        res.add(root.val);
        res.addAll(preorderTraversal(root.left));
        res.addAll(preorderTraversal(root.right));
        return res;
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
        System.out.println(preorderTraversal(treeNode1));
    }
}
