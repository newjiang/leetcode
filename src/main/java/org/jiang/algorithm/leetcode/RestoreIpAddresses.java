package org.jiang.algorithm.leetcode;

import java.util.ArrayList;
import java.util.List;

public class RestoreIpAddresses {
    public static void main(String[] args) {
        String ip = "25525511135";
        new RestoreIpAddresses().restoreIpAddresses(ip);
    }

    List<String> strings = new ArrayList<>();

    public List<String> restoreIpAddresses(String s) {
        String ip = s + "&&&&&&&&&&&&";
        solution(ip, "", 0, 1, 1);
        solution(ip, "", 0, 2, 1);
        solution(ip, "", 0, 3, 1);
        List<String> ipList = new ArrayList<>();
        this.strings.removeIf(e -> e.contains("&") || s.length() + 4 != e.length());
        for (String string : this.strings) {
            boolean flag = true;
            String ipValue = string.substring(0, string.length() - 1);
            String[] split = ipValue.split("\\.");
            for (String s1 : split) {
                if (s1.length() != 1 && s1.startsWith("0")) {
                    flag = false;
                    continue;
                }
                int anInt = Integer.parseInt(s1);
                if (anInt < 0 || anInt > 255) {
                    flag = false;
                    continue;
                }

            }
            if (flag) {
                ipList.add(ipValue);
            }
        }
        return ipList;
    }

    public void solution(String ip, String segement, int start, int step, int times) {
        String str = segement + ip.substring(start, start + step) + ".";
        if (times == 4) {
            strings.add(str);
            return;
        }
        for (int i = 1; i <= 3; i++) {
            solution(ip, str, start + step, i, times + 1);
        }
    }

}
