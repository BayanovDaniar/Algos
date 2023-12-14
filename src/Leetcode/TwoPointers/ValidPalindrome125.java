package Leetcode.TwoPointers;

import java.util.Locale;

public class ValidPalindrome125 {
    public static void main(String[] args) {
        System.out.println(isPalindrome(" a.b.a,,, "));
    }

    public static boolean isPalindrome(String s) {
        if (s.isEmpty()) return true;

        char[] str = s.toLowerCase(Locale.ROOT).toCharArray();
        int i = 0;
        int j = str.length - 1;
        while (i < j) {
            if (!Character.isLetterOrDigit(str[i])) {
                i++;
            } else if (!Character.isLetterOrDigit(str[j])) {
                j--;
            } else {
                if (str[i++] != str[j--]) return false;
            }
        }
        return true;
    }
}
