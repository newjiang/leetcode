package com.jiang.algorithm.stack;

import java.util.Stack;

/**
 * @author: newjiang
 * @date: 2020/4/1 17:53
 * @description: todo 有效的括号
 * 示例 1:
 * 输入: "()"
 * 输出: true
 *
 * 示例 2:
 * 输入: "()[]{}"
 * 输出: true
 *
 * 示例 3:
 * 输入: "(]"
 * 输出: false
 *
 * 示例 4:
 * 输入: "([)]"
 * 输出: false
 *
 * 示例 5:
 * 输入: "{[]}"
 * 输出: true
 *
 **/
public class Solution2 {
    public static void main(String[] args) {
        String s = "(){}[)]{}";
        boolean valid = new Solution2().isValid(s);
        System.out.println(valid);
    }

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        char[] chars = s.toCharArray();
        try {
            for (int i = 0; i < chars.length; i++) {
                if (chars[i] == '(' || chars[i] == '{' || chars[i] == '[') {
                    stack.push(chars[i]);
                } else {
                    if (chars[i] == ')') {
                        if ('(' != stack.peek()) {
                            return false;
                        } else {
                            stack.pop();
                        }
                    }
                    if (chars[i] == '}') {
                        if ('{' != stack.peek()) {
                            return false;
                        } else {
                            stack.pop();
                        }
                    }
                    if (chars[i] == ']') {
                        if ('[' != stack.peek()) {
                            return false;
                        } else {
                            stack.pop();
                        }
                    }
                }
            }
        } catch (Exception e) {
            // 报错则说明已经不合法了，如()) 第二个( stack.pop或peek的时候已经没有元素了
            return false;
        }
        return stack.size() == 0;
    }

}
