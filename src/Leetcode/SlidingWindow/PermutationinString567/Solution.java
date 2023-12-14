package Leetcode.SlidingWindow.PermutationinString567;

import java.util.HashMap;

public class Solution {
    public static void main(String[] args) {
        System.out.println(checkInclusion("ab", "eidbaooo"));
        System.out.println(checkInclusion("ab", "eidboaoo"));
        System.out.println(checkInclusion("a", "ab"));
        System.out.println(checkInclusion("adc", "dcda"));
    }

    public static boolean checkInclusion(String s1, String s2) {
        int i = 0;
        int [] alpha = new int[26];
        for(int j = 0; j < s1.length(); j++){
            alpha[s1.charAt(j) - 'a']++;
        }
        int maxLength = 0;

        for(int j = 0; j < s2.length(); j++){

            while (i <= j && alpha[s2.charAt(j) - 'a'] == 0){
                alpha[s2.charAt(i) - 'a']++;
                i++;
            }
            maxLength = Math.max(maxLength, j-i+1);
            alpha[s2.charAt(j) - 'a']--;
            if (maxLength==s1.length())return true;
        }
        return maxLength==s1.length();
    }
}
