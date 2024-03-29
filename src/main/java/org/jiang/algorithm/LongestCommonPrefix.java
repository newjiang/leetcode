package org.jiang.algorithm;

public class LongestCommonPrefix {

    public static void main(String[] args) {
        String[] strs = new String[]{""};
        String s = new LongestCommonPrefix().longestCommonPrefix(strs);
        System.out.println("===" + s);
    }

    /**
     * @param strs
     * @return
     */
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()){
                    return "";
                }
            }
        }
        return prefix;
    }

    /**
     * @param strs
     * @return
     */
    public String longestCommonPrefix1(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        for (int i = 0; i < strs[0].length(); i++) {
            char profix = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (i == strs[j].length() || strs[j].charAt(i) != profix) {
                    return strs[0].substring(0, i);
                }
            }
        }
        return strs[0];
    }
}
