package com.jiang.algorithm.stack;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: newjiang
 * @date: 2020/4/2 11:45
 * @description: todo 二叉树的中序遍历
 **/
public class InorderTraversal {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        return fun(root, list);
    }

    /**
     * 递归获取
     *
     * @param root
     * @param list
     * @return
     */
    private List<Integer> fun(TreeNode root, List<Integer> list) {
        if (root != null) {
            fun(root.getLeft(root), list);
            list.add(root.val);
            fun(root.getRight(root), list);
        }
        return list;
    }
}

class TreeNode {

    public int val;
    public TreeNode left;
    public TreeNode right;

    TreeNode(int x) {
        val = x;
    }

    public TreeNode getLeft(TreeNode node) {
        return node.left;
    }

    public TreeNode getRight(TreeNode node) {
        return node.right;
    }
}
