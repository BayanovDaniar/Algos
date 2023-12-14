package Leetcode.ArraysHashing.LongestConsecutiveSequence128;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        int[] nums = {0,3,7,2,5,8,4,6,0,1};
        System.out.println(longestConsecutive(nums));
    }

    public static int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        if(nums.length == 0) return 0;
        for(int i : nums){
            set.add(i);
        }
        int seq = 1;
        int maxSeq = 1;
        for (int num : nums) {
            int post = num + 1;
            if(set.contains(post))continue;

//            while (set.contains(post)){
//                seq++;
//                set.remove(post++);
//            }

            int prev = num - 1;
            while (set.contains(prev)) {
                set.remove(prev--);
                seq++;
            }
            if(maxSeq > nums.length/2) break;
            if (seq > maxSeq) maxSeq = seq;
            seq = 1;
        }
        return maxSeq;
    }
}
