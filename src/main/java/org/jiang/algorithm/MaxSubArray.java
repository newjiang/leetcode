package org.jiang.algorithm;

/**
 * @author: newjiang
 * @date: 2020/4/29 17:03
 * @description: todo
 **/
public class MaxSubArray {

    public static void main(String[] args) {
        int[] arr = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(new MaxSubArray().maxSubArray(arr));
    }

    public int maxSubArray(int[] nums) {
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] > 0) {
                nums[i] += nums[i - 1];
            }
            max = Math.max(nums[i], max);
        }
        return max;
    }
}
