package org.jiang.algorithm.leetcode;
/*
罗马数字包含以下七种字符： I， V， X， L，C，D 和 M。
字符          数值
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
例如， 罗马数字 2 写做 II ，即为两个并列的 1。12 写做 XII ，即为 X + II 。 27 写做  XXVII, 即为 XX + V + II 。

通常情况下，罗马数字中小的数字在大的数字的右边。但也存在特例，例如 4 不写做 IIII，而是 IV。数字 1 在数字 5 的左边，所表示的数等于大数 5 减小数 1 得到的数值 4 。同样地，数字 9 表示为 IX。这个特殊的规则只适用于以下六种情况：

I 可以放在 V (5) 和 X (10) 的左边，来表示 4 和 9。
X 可以放在 L (50) 和 C (100) 的左边，来表示 40 和 90。 
C 可以放在 D (500) 和 M (1000) 的左边，来表示 400 和 900。
给你一个整数，将其转为罗马数字。

 

示例 1:

输入: num = 3
输出: "III"
示例 2:

输入: num = 4
输出: "IV"
示例 3:

输入: num = 9
输出: "IX"
示例 4:

输入: num = 58
输出: "LVIII"
解释: L = 50, V = 5, III = 3.
示例 5:

输入: num = 1994
输出: "MCMXCIV"
解释: M = 1000, CM = 900, XC = 90, IV = 4.

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/integer-to-roman
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class IntegerToRomanNumeral {

    public static void main(String[] args) {
        IntegerToRomanNumeral numeral = new IntegerToRomanNumeral();
        System.out.println(numeral.intToRoman(3));
        System.out.println(numeral.intToRoman(4));
        System.out.println(numeral.intToRoman(9));
        System.out.println(numeral.intToRoman(58));
        System.out.println(numeral.intToRoman(1994));
    }

    public String intToRoman(int num) {
        StringBuilder builder = new StringBuilder();
        int unit = 1000;
        while (num - unit > 0 || num > 0) {
            if (num - unit >= 0) {
                builder.append(getUnit(unit));
                num = num - unit;
            } else {
                unit = changeUnit(unit);
                if (unit == -1) {
                    break;
                }
            }
        }
        return builder.toString();
    }

    private int changeUnit(int unit) {
        int newUnit;
        switch (unit) {
            case 1000:
                newUnit = 900;
                break;
            case 900:
                newUnit = 500;
                break;
            case 500:
                newUnit = 400;
                break;
            case 400:
                newUnit = 100;
                break;
            case 100:
                newUnit = 90;
                break;
            case 90:
                newUnit = 50;
                break;
            case 50:
                newUnit = 40;
                break;
            case 40:
                newUnit = 10;
                break;
            case 10:
                newUnit = 9;
                break;
            case 9:
                newUnit = 5;
                break;
            case 5:
                newUnit = 4;
                break;
            case 4:
                newUnit = 1;
                break;
            default:
                newUnit = -1;
                break;
        }
        return newUnit;
    }

    private String getUnit(int unit) {
        String newUnit;
        switch (unit) {
            case 1000:
                newUnit = "M";
                break;
            case 900:
                newUnit = "CM";
                break;
            case 500:
                newUnit = "D";
                break;
            case 400:
                newUnit = "CD";
                break;
            case 100:
                newUnit = "C";
                break;
            case 90:
                newUnit = "XC";
                break;
            case 50:
                newUnit = "L";
                break;
            case 40:
                newUnit = "XL";
                break;
            case 10:
                newUnit = "X";
                break;
            case 9:
                newUnit = "IX";
                break;
            case 5:
                newUnit = "V";
                break;
            case 4:
                newUnit = "IV";
                break;
            default:
                newUnit = "I";
                break;
        }
        return newUnit;
    }
}
