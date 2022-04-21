package org.jiang.algorithm.leetcode;

import java.util.Arrays;

public class FindMedianSortedArrays {
    public static void main(String[] args) {
        int[] nums1 = {1,2};
        int[] nums2 = {3,4};
        new FindMedianSortedArrays().findMedianSortedArrays(nums1, nums2);
    }
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] data = new int[nums1.length + nums2.length];
        for (int i = 0; i < nums1.length; i++) {
            data[i] = nums1[i];
        }
        for (int i = 0; i < nums2.length; i++) {
            data[i + nums1.length] = nums2[i];
        }
        Arrays.sort(data);
        if (data.length % 2 == 0) {
            int num1 = data[data.length / 2];
            int num2 = data[data.length / 2 - 1];
            return (num1 + num2) / 2d;
        } else {
            return data[data.length / 2];
        }
    }
}
