package com.jiang.algorithm.stack;

import java.util.Stack;

/**
 * @author: newjiang
 * @date: 2020/04/01
 * @description: todo 有效括号的嵌套深度
 *
 * 示例 1：
 * 输入：seq = "(()())"
 * 输出：[0,1,1,1,1,0]
 *
 * 示例 2：
 * 输入：seq = "()(())()"
 * 输出：[0,0,0,1,1,0,1,1]
 *
 * todo 具体解释：
 * ( ( ( ) ) )
 * 1 2 3 3 2 1
 * 1 2 3 4 5 6
 * 0 1 0 0 1 0
 * 对于(：深度是奇数的是0，偶数的是1
 * 对于)：深度是奇数的是0，偶数的是1
 *
 **/
public class Solution1 {

    public static void main(String[] args) {
        String seq = "((()))";
        Solution1 so = new Solution1();
        int[] ints = so.maxDepthAfterSplitByStack(seq);
        for (int i = 0; i < ints.length; i++) {
            System.out.print(ints[i] + " ");
        }
    }

    /**
     * 目前最优
     * @param seq
     * @return
     */
    public int[] maxDepthAfterSplit(String seq) {
        int index = 0;
        char[] chars = seq.toCharArray();
        int[] array = new int[seq.length()];
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '(') {
                array[i] = index % 2;
                index++;
            } else {
                index--;
                array[i] = index % 2;
            }
        }
        return array;
    }


    /**
     * 加了Stack的操作，所以会变慢
     * @param seq
     * @return
     */
    public int[] maxDepthAfterSplitByStack(String seq) {
        int index = 0;
        int[] array = new int[seq.length()];
        Stack<String> stack = new Stack<String>();
        for (int i = 0; i < array.length; i++) {
            stack.push(seq.substring(i, i + 1));
            if (stack.peek().equals("(")) {
                array[i] = (index) % 2;
                index++;
            }
            if (stack.peek().equals(")")) {
                index--;
                array[i] = (index) % 2;
            }
        }
        return array;
    }
}


