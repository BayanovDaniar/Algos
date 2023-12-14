package Leetcode.BinarySearch.SearchInsertPosition35;

public class Solution {
    public static void main(String[] args) {
        System.out.println(searchInsert(new int[]{1,3,5,6}, 7));
    }

    public static int searchInsert(int[] nums, int target) {
        int l = 0, r = nums.length;
        int medium;

        while(l < r){
            medium = (l + r) / 2;
            if(nums[medium] < target){
                l = medium + 1;
            }else{
                r = medium;
            }
        }

        return l;
    }
}
