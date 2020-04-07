package com.jiang.algorithm;

/**
 * @author: newjiang
 * @date: 2020/04/07
 * @description: todo 整数反转
 **/
public class Reverse {
    public static void main(String[] args) {
        int number = 12345679;
        System.out.println(new Reverse().recursion(number));
    }


    /**
     * 基于取余的递归方式
     * @param x
     * @return
     */
    public int recursion(int x) {
        return recursion(0, x);
    }
    public int recursion(long ans, int x) {
        if (x == 0) {
            return ans > Integer.MAX_VALUE || ans < Integer.MIN_VALUE ? 0 : (int) ans;
        }
        ans = ans * 10 + x % 10;
        return recursion(ans, x / 10);
    }


    /**
     * 取余法 todo 最快
     * 123
     * 123 * 10 + 3 = 1233  x = 123
     * 12  * 10 + 2 = 122    x = 12
     * 1   * 10 + 1 = 10    x = 1
     *
     * @param x
     * @return
     */
    public int reverse(int x) {
        // 防止溢出情况
        long ans = 0;
        while (x != 0) {
            ans = ans * 10 + x % 10;
            x /= 10;
        }
        return ans > Integer.MAX_VALUE || ans < Integer.MIN_VALUE ? 0 : (int) ans;
    }

    /**
     * By Java API = 暴力破解 = 简单易用
     * @param x
     * @return
     */
    public int reverse1(int x) {
        if (x >= 0) {
            String s = new StringBuilder(String.valueOf(x)).reverse().toString();
            int result;
            try {
                result = Integer.valueOf(s);
            } catch (Exception e) {
                return 0;
            }
            return result;
        } else {
            String s = new StringBuilder(String.valueOf(Math.abs(x))).reverse().toString();
            int result;
            try {
                result = Integer.valueOf(s);
            } catch (Exception e) {
                return 0;
            }
            return -Integer.valueOf(s);
        }
    }
}
