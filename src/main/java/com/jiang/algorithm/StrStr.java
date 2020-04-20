package com.jiang.algorithm;

/**
 * @author: newjiang
 * @date: 2020/4/20 17:32
 * @description: todo 给定一个 haystack 字符串和一个 needle 字符串，在 haystack 字符串中找出 needle 字符串出现的第一个位置 (从0开始)。如果不存在，则返回  -1
 *
 **/
public class StrStr {

    public static void main(String[] args) {
        System.out.println(new StrStr().strStr("aaaaa", "bba"));
    }

    public int strStr(String haystack, String needle) {
        int length = needle.length();
        for (int i = 0; i <= haystack.length() - length; i++) {
            String sub = haystack.substring(i, length + i);
            if (needle.equals(sub)) {
                return i;
            }
        }
        return -1;
    }

}
