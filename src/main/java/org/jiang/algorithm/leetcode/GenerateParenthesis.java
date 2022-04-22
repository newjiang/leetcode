package org.jiang.algorithm.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenerateParenthesis {
    public static void main(String[] args) {
        System.out.println(new GenerateParenthesis().generateParenthesis(3));
        System.out.println(new GenerateParenthesis().generateParenthesis(1));

    }

    public List<String> generateParenthesis(int n) {
        List<List<String>> data = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            data.add(Arrays.asList("(", ")"));
            data.add(Arrays.asList("(", ")"));
        }
        List<String> resList = new ArrayList<>();
        init(data, resList, "", 0);
        return resList;
    }

    private void init(List<List<String>> data, List<String> resList, String item, int index) {
        List<String> strings = data.get(index);
        for (String str : strings) {
            String val = str + item;
            if (data.size() == index + 1) {
                boolean valid = isValid(val);
                if (valid) {
                    resList.add(val);
                }
                return;
            } else {
                init(data, resList, val, index + 1);
            }
        }
    }

    private boolean isValid(String data) {
        int count = 0;
        for (int i = 0; i < data.length(); i++) {
            char ch = data.charAt(i);
            if (ch == '(') {
                count++;
            } else {
                count--;
            }
            if (count < 0) {
                return false;
            }
        }
        return count == 0;
    }
}
