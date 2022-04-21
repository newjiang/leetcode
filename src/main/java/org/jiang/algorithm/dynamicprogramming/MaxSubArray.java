package org.jiang.algorithm.dynamicprogramming;

/**
 * 给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
 * 例子：
 * 输入：nums = [-2, 1, -3, 4, -1, 2, 1, -5, 4]
 * 输出：6
 * 解释：连续子数组 [4,-1,2,1] 的和最大，为 6 。
 */
public class MaxSubArray {
    public static void main(String[] args) {
        int[] nums1 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int[] nums2 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int[] nums3 = {5, 4, -1, 7, 8};
        System.out.println(dynamicProgramming(nums1));
        System.out.println(greedy(nums2));
        System.out.println(maxSubArray(nums3));
    }

    public static int maxSubArray(int[] nums) {
        /**
         * pre是前n项目的最优解
         * 如果只有一个元素时，+0还是原来的数据
         */
        int pre = 0;
        int max = nums[0];
        for (int num : nums) {
            // 前n项的最有解 + 第n项的值 与 第n项的值比较大小，比较完更新为最优解
            pre = Math.max(num + pre, num);
            // 当前最优解和之前最优解对比
            max = Math.max(pre, max);
        }
        return pre;
    }

    /**
     * 动态规划
     *
     * @param nums 数组
     * @return 连续子数组最大和
     */
    public static int dynamicProgramming(int[] nums) {
        int pre = 0;
        int maxAns = nums[0];
        for (int x : nums) {
            // pre来维护对于当前f(i)的f(i−1)的值是多少
            pre = Math.max(pre + x, x);     // 判断f(i-1)是否要加到当前数上
            maxAns = Math.max(maxAns, pre); // 获取最大值
        }
        return maxAns;
    }

    /**
     * 贪心算法
     *
     * @param nums 数组
     * @return 连续子数组最大和
     */
    public static int greedy(int[] nums) {
        // 类似寻找最大最小值的题目,初始值一定要定义成理论上的最小最大值
        int result = Integer.MIN_VALUE;
        int numsSize = nums.length;
        int sum = 0;
        for (int i = 0; i < numsSize; i++) {
            sum += nums[i];
            result = Math.max(result, sum);
            // 如果sum < 0,重新开始找子序串
            if (sum < 0) {
                sum = 0;
            }
        }
        return result;
    }
}
