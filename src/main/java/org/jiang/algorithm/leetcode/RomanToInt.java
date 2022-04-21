package org.jiang.algorithm.leetcode;

import java.util.HashMap;
import java.util.Map;

public class RomanToInt {
    public static void main(String[] args) {
        RomanToInt romanToInt = new RomanToInt();
        System.out.println(romanToInt.romanToInt("III"));
        System.out.println(romanToInt.romanToInt("IV"));
        System.out.println(romanToInt.romanToInt("IX"));
        System.out.println(romanToInt.romanToInt("LVIII"));
        System.out.println(romanToInt.romanToInt("MCMXCIV"));
        System.out.println(romanToInt.romanToInt("DCXXI"));

    }

    public int romanToInt(String s) {
        Map<String, Integer> map = new HashMap<>();
        map.put("M", 1000);
        map.put("CM", 900);
        map.put("D", 500);
        map.put("CD", 400);
        map.put("C", 100);
        map.put("XC", 90);
        map.put("L", 50);
        map.put("XL", 40);
        map.put("X", 10);
        map.put("IX", 9);
        map.put("V", 5);
        map.put("IV", 4);
        map.put("I", 1);
        int val = 0;
        int length = s.length();
        for (int i = 0; i < length; i++) {
            String sub1 = String.valueOf(s.charAt(i));
            String sub2 = i == length - 1 ? sub1 : sub1 + s.charAt(i + 1);
            if (map.containsKey(sub2)) {
                val += map.get(sub2);
                i++;
                continue;
            }
            if (map.containsKey(sub1)) {
                val += map.get(sub1);
            }
        }
        return val;
    }
}
