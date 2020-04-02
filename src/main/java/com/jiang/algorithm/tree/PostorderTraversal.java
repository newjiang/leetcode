package com.jiang.algorithm.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: newjiang
 * @date: 2020/4/2 12:55
 * @description: todo 二叉树的后序遍历
 **/
public class PostorderTraversal {

    public List<Integer> postorderTraversal(TreeNode root) {
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
            fun(root.getRight(root), list);
            list.add(root.val);
        }
        return list;
    }
}

