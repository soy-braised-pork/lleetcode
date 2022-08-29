package leetcode.doublepointer.binarytree;

import java.util.LinkedList;
import java.util.List;

/**
 * @author zhulx
 *
 * 二叉树的前序遍历
 * 给你二叉树的根节点 root ，返回它节点值的 前序 遍历。
 **/
public class E_144 {
    public List<Integer> preorderTraversal(E_104.TreeNode root) {
        final LinkedList<Integer> res = new LinkedList<>();
        if (root==null){
            return res;
        }
        res.add(root.val);
        res.addAll(preorderTraversal(root.left));
        res.addAll(preorderTraversal(root.right));
        return res;
    }
}
