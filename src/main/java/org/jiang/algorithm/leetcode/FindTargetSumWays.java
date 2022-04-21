package org.jiang.algorithm.leetcode;

public class FindTargetSumWays {
    int count = 0;

    public static void main(String[] args) {
        int[] nums = {1};
        int target = 1;
        System.out.println(new FindTargetSumWays().findTargetSumWays(nums, target));
    }

    public int findTargetSumWays(int[] nums, int target) {
        findResult(nums, target, 0, 0);
        return count;
    }

    /**
     * 寻找结果
     *
     * @param nums   数组
     * @param target 目标值
     * @param index  下标
     * @param sum    计算和
     */
    public void findResult(int[] nums, int target, int index, int sum) {
        if (index == nums.length) {
            if (sum == target) {
                count++;
            }
        } else {
            findResult(nums, target, index + 1, sum + nums[index]);
            findResult(nums, target, index + 1, sum - nums[index]);
        }
    }

}
