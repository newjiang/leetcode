package org.jiang.algorithm;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author: newjiang
 * @date: 2020/04/03
 * @description: todo 无重复字符的最长子串
 *
 **/
public class LengthOfLongestSubstring {
    public static void main(String[] args) {
        String s = "abcabace";
        System.out.println(new LengthOfLongestSubstring().lengthOfLongestSubstring(s));
    }

    /**
     * 滑动窗口
     * @param s
     * @return
     */
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        Map<Character, Integer> map = new HashMap<>();
        char[] chars = s.toCharArray();
        for (int start = 0, end = 0; start < chars.length; start++) {
            if (map.containsKey(chars[start])) {
                end = Math.max(map.get(chars[start]), end);
            }
            maxLength = Math.max(maxLength, start - end + 1);
            map.put(chars[start], start + 1);
        }
        return maxLength;
    }

    /**
     * 暴力破解
     * @param s
     * @return
     */
    public int lengthOfLongestSubstring1(String s) {
        int maxLength = 0;
        for (int i = 1; i <= s.length(); i++) {
            for (int j = 0; j <= s.length() - i; j++) {
                Set<Character> set = new HashSet<>();
                String key = s.substring(j, j + i);
                char[] chars = key.toCharArray();
                int length = chars.length;
                for (int k = 0; k < length; k++) {
                    set.add(chars[k]);
                }
                if (set.size() == length && length > maxLength) {
                    maxLength = length;
                }
            }
        }
        return maxLength;
    }
}
