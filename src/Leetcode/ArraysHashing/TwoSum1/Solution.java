package Leetcode.ArraysHashing.TwoSum1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> dict = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            if(dict.containsKey(target - nums[i])){
                return new int[]{dict.get(target - nums[i]), i};
            }else{
                dict.put(nums[i], i);
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.twoSum(new int[]{3,2,4}, 6)));
    }
}
