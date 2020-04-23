package com.jiang.algorithm;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @author: newjiang
 * @date: 2020/4/23 9:11
 * @description: todo
 **/
public class SingleNumber {
    public static void main(String[] args) {
        int[] arr = new int[]{4,1,2,1,2};
        System.out.println(new SingleNumber().singleNumber(arr));
    }

    public int singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            boolean b = map.containsKey(nums[i]);
            if (b) {
                map.put(nums[i], 2);
            } else {
                map.put(nums[i], 1);
            }
        }
        for (Map.Entry<Integer, Integer> m : map.entrySet()) {
            if (m.getValue() == 1) {
                return m.getKey();
            }
        }
        return 0;
    }
}
