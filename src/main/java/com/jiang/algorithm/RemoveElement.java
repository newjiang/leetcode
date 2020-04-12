package com.jiang.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveElement {

    public static void main(String[] args) {

        int[] nums = new int[]{3,2,2,3};
        int var = 3;
        System.out.println(new RemoveElement().removeElement(nums, var));
    }

    public int removeElement(int[] nums, int val) {
        int size = nums.length;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                size--;
            } else {
                list.add(nums[i]);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            nums[i] = list.get(i);
        }
        return size ;
    }
}
