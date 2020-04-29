package com.jiang.algorithm;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: newjiang
 * @date: 2020/4/23 9:22
 * @description: todo
 **/
public class FindDuplicate {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 3, 4, 2, 2};
        System.out.println(new FindDuplicate().findDuplicate(arr));
    }

    public int findDuplicate(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                return nums[i];
            } else {
                map.put(nums[i], 1);
            }
        }
        return 0;
    }

}
