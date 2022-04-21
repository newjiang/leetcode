package org.jiang.algorithm.leetcode;

public class MaxArea {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int area = 0;
        while (left < right) {
            int val = (right - left) * Math.min(height[left], height[right]);
            if (val > area) {
                area = val;
            }
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return area;
    }

    private int extracted(int[] height) {
        int max = 0;
        for (int i = 0; i < height.length; i++) {
            for (int j = 0; j < height.length; j++) {
                int value = Math.min(height[i], height[j]) * Math.abs(i - j);
                if (value > max) {
                    max = value;
                }
            }
        }
        return max;
    }
}
