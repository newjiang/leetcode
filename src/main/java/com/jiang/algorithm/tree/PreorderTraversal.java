package com.jiang.algorithm.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: newjiang
 * @date: 2020/4/2 14:02
 * @description: todo 二叉树的前序遍历
 **/
public class PreorderTraversal {



    public List<Integer> preorderTraversal(TreeNode root) {
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


