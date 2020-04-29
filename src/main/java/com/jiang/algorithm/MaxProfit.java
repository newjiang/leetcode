package com.jiang.algorithm;

/**
 * @author: newjiang
 * @date: 2020/4/29 17:32
 * @description: todo  买卖股票的最佳时机
 * 例如数据右边所列举:  7,  1,  5,  3,  6,  4
 * 转化为每天的涨跌 =>   -6  +4  -2  +3  -2
 * 即[7, 1, 5, 3, 6, 4] => [-6, +4, -2, +3, -2]
 * 最后的问题是求数组最大的连续子集[-6, +4, -2, +3, -2] => [+4, -2, +3]
 **/
public class MaxProfit {

    public static void main(String[] args) {
        int[] arr = new int[]{};
        System.out.println(new MaxProfit().maxProfit(arr));
    }

    public int maxProfit(int[] prices) {

        if (prices.length < 2) {
            return 0;
        }

        int[] temp = new int[prices.length - 1];
        for (int i = 1; i < prices.length; i++) {
            temp[i - 1] = prices[i] - prices[i - 1];
        }

        int max = temp[0];
        for (int i = 1; i < temp.length; i++) {
            if (temp[i - 1] > 0) {
                temp[i] += temp[i - 1];
            }
            max = Math.max(temp[i], max);
        }
        return max > 0 ? max : 0;
    }

    /**
     * 整合版本
     * @param prices
     * @return
     */
    public int maxProfit1(int[] prices) {
        if (prices.length < 2) {
            return 0;
        }
        int max = prices[1] - prices[0];
        int[] temp = new int[prices.length - 1];
        for (int i = 1; i < prices.length; i++) {
            temp[i - 1] = prices[i] - prices[i - 1];
            if (i > 1) {
                if (temp[i - 2] > 0) {
                    temp[i - 1] += temp[i - 2];
                }
                max = Math.max(temp[i - 1], max);
            }
        }
        return max > 0 ? max : 0;
    }
}
