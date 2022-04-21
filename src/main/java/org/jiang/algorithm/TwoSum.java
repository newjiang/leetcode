package org.jiang.algorithm;

/**
 * @author: newjiang
 * @date: 2020/4/2 14:13
 * @description: todo 两个数之和
 **/
public class TwoSum {

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] ints = new TwoSum().twoSum(nums, target);
        System.out.println(ints[0] + "," + ints[1]);
    }

    public int[] twoSum1(int[] nums, int target) {
        int[] result = new int[2];
        int index1 = 0;
        int index2 = 0;
        for (int i = 0; i < nums.length; i++) {

        }
        return result;
    }
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int first = nums[i];
            for (int j = 0; j < nums.length; j++) {
                if (first + nums[j] == target && i != j) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;
    }
}
