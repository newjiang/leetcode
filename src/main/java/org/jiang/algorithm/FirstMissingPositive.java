package org.jiang.algorithm;

import java.util.*;

public class FirstMissingPositive {

    public static void main(String[] args) {
        int[] nums = new int[]{3, 4, 5};
        System.out.println(new FirstMissingPositive().firstMissingPositive(nums));
    }

    public int firstMissingPositive(int[] nums) {
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();
        // 利用treeMap过滤并排序大于0的元素
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 1) {
                continue;
            }
            treeMap.put(nums[i], 1);
        }
        // 校验最小的元素是否大于1，大于1则说明缺失的是1
        boolean first = true;
        for (Map.Entry<Integer, Integer> m : treeMap.entrySet()) {
            Integer key = m.getKey();
            if (first) {
                first = false;
                if (key > 1) {
                    return 1;
                }
            }
            // 如果没有当前元素+1的元素，则说明元素+1是缺少的最小正整数
            if (!treeMap.containsKey(key + 1)) {
                return key + 1;
            }
        }
        return 1;
    }
}
