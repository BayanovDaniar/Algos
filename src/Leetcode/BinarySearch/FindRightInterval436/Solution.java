package Leetcode.BinarySearch.FindRightInterval436;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(findRightInterval(new int[][]{{3,4},{2,3},{1,2}})));
        System.out.println(Arrays.toString(findRightInterval(new int[][]{{1,2}})));

    }


    public static int[] findRightInterval(int[][] intervals) {
        TreeMap<Integer, Integer> right = new TreeMap<>();

        for(int i = 0; i < intervals.length; i++){
            right.put(intervals[i][0],i);
        }

        int [] answer = new int[intervals.length];
        for(int i = 0; i < intervals.length; i++){
            SortedMap<Integer,Integer> map = right.tailMap(intervals[i][1]);
            if(map.isEmpty())answer[i] = -1;
            else {
                answer[i] = map.get(map.firstKey());
            }
        }

        return answer;
    }
}
