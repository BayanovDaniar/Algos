package Leetcode.SlidingWindow.LongestRepeatingCharacterReplacement424;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        System.out.println(characterReplacement2("AABABBA", 1));
        System.out.println(characterReplacement2("ABAB", 2));
    }


    public static int characterReplacement2(String s, int k) {
        int[] count = new int[26]; // Assuming only uppercase letters

        int maxCount = 0;
        int maxLength = 0;
        int start = 0;

        for (int end = 0; end < s.length(); end++) {
            maxCount = Math.max(maxCount, ++count[s.charAt(end) - 'A']);

            // If the number of characters to change is more than k,
            // shrink the window from the left side
            while (end - start + 1 - maxCount > k) {
                count[s.charAt(start) - 'A']--;
                start++;
            }

            maxLength = Math.max(maxLength, end - start + 1);
        }

        return maxLength;
    }



    public static int characterReplacement(String s, int k) {
        int[] arr = new int[26];
        int ans = 0;
        int max = 0;
        int i = 0;
        for (int j = 0; j < s.length(); j++) {
            arr[s.charAt(j) - 'A']++;
            max = Math.max(max, arr[s.charAt(j) - 'A']);
            if (j - i + 1 - max > k) {
                arr[s.charAt(i) - 'A']--;
                i++;
            }
            ans = Math.max(ans, j - i + 1);
        }
        return ans;
    }
}
