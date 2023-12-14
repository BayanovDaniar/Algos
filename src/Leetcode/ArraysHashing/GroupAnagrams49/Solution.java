package Leetcode.ArraysHashing.GroupAnagrams49;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Solution {

    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> dict = new HashMap<>();

        for(String s : strs){
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String l = new String(chars);

            if(dict.containsKey(l)){
                dict.get(l).add(s);
            }else{
                dict.put(l, new ArrayList<>());
                dict.get(l).add(s);
            }
        }

        return new ArrayList<>(dict.values());
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        for(List<String> stringList: solution.groupAnagrams(new String[]{"eat","tea","tan","ate","nat","bat"})){
            System.out.println(stringList.toString());
        }
    }
}
