package org.jiang.algorithm.leetcode;

public class LongestPalindrome {
    public static void main(String[] args) {
        String s = new LongestPalindrome().longestPalindrome("bbb");
        System.out.println(s);
    }

    String result = "";

    public String longestPalindrome(String s) {
        if (valid(s)) {
            return s;
        }
        find(s, 1);
        return result.length() != 0 ? result : String.valueOf(s.charAt(0));
    }

    private void find(String s, int step) {
        if (step > s.length()) {
            return;
        }
        for (int i = 0; i < s.length() - step + 1; i++) {
            String substring = s.substring(i, i + step);
            boolean valid = valid(substring);
            if (valid && substring.length() > result.length()) {
                result = substring;
            }
        }
        find(s, step + 1);
    }

    public boolean valid(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
