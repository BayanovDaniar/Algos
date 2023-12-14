package Leetcode.ArraysHashing.ValidAnagram242;

import java.util.HashMap;
import java.util.Map;

class Solution {


    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length())return false;
        if(s.equals(t)) return true;

        char[] chars = s.toCharArray();
        Map<Character,Integer> map = new HashMap<>();

        for(char c: chars){
            map.put(c, map.getOrDefault(c,0)+1);
        }

        for(int i = 0; i < t.length(); i++){

            if(map.containsKey(t.charAt(i)) && map.get(t.charAt(i)) != 0){
                map.replace(t.charAt(i), map.get(t.charAt(i)) - 1);
            }else{
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Solution solution = new Solution();
        System.out.println(solution.isAnagram("aacc", "ccac"));
    }
}
