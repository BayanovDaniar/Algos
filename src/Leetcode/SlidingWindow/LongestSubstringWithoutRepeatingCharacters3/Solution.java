package Leetcode.SlidingWindow.LongestSubstringWithoutRepeatingCharacters3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
        System.out.println(lengthOfLongestSubstring( "bbbbb"));
        System.out.println(lengthOfLongestSubstring("pwwkew"));
        System.out.println(lengthOfLongestSubstring("aab"));
        System.out.println(lengthOfLongestSubstring("dvdf"));
        System.out.println(lengthOfLongestSubstring("abba"));
    }

    public static int lengthOfLongestSubstring(String s) {
        int length = 0;
        int left = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        int right;
        for(right = 0; right < s.length(); right++){
            if(map.containsKey(s.charAt(right))){
                length = Math.max(length, right-left);
                left = Math.max(map.get(s.charAt(right)) + 1 , left);
                map.remove(s.charAt(right));
            }
            map.put(s.charAt(right),right);
        }
        return Math.max(length, right-left);
    }
}
