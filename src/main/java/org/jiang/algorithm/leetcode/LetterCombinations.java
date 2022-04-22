package org.jiang.algorithm.leetcode;

import java.util.*;

/*
给定一个仅包含数字2-9的字符串，返回所有它能表示的字母组合。答案可以按 任意顺序 返回。

给出数字到字母的映射如下（与电话按键相同）。注意 1 不对应任何字母。

示例 1：

输入：digits = "23"
输出：["ad","ae","af","bd","be","bf","cd","ce","cf"]
示例 2：

输入：digits = ""
输出：[]
示例 3：

输入：digits = "2"
输出：["a","b","c"]

 */
public class LetterCombinations {
    private static Map<String, List<String>> digitsMap = new HashMap<>();
    static {
        digitsMap.put("2", Arrays.asList("a", "b", "c"));
        digitsMap.put("3", Arrays.asList("d","e","f"));
        digitsMap.put("4", Arrays.asList("g","h","i"));
        digitsMap.put("5", Arrays.asList("j","k","l"));
        digitsMap.put("6", Arrays.asList("m","n","o"));
        digitsMap.put("7", Arrays.asList("p", "q", "r", "s"));
        digitsMap.put("8", Arrays.asList("t","u","v"));
        digitsMap.put("9", Arrays.asList("w", "x", "y", "z"));
    }


    public static void main(String[] args) {
        System.out.println(new LetterCombinations().letterCombinations("2"));
        System.out.println(new LetterCombinations().letterCombinations(""));
        System.out.println(new LetterCombinations().letterCombinations("23"));

    }

    public List<String> letterCombinations(String digits) {
        List<List<String>> data = new ArrayList<>();
        for (int i = 0; i < digits.length(); i++) {
            String sub = String.valueOf(digits.charAt(i));
            List<String> strings = digitsMap.get(sub);
            data.add(strings);
        }
        List<String> resList = new ArrayList<>();
        if (data.size() == 0) {
            return resList;
        }
        calc(data, resList, "", 0);
        return resList;
    }

    private void calc(List<List<String>> data, List<String> resList, String str, int index) {
        List<String> strings = data.get(index);
        for (String item : strings) {
            String val = str + item;
            if (data.size() == index + 1) {
                resList.add(val);
            } else {
                calc(data, resList, val, index + 1);
            }
        }
    }
}
