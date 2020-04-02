package com.jiang.algorithm.tree;

/**
 * @author: newjiang
 * @date: 2020/04/02
 * @description: todo
 **/
public class TreeNode {

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
