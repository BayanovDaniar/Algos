package Leetcode.BinarySearch.BinarySearch704;

public class Solution {
    public static void main(String[] args) {
        System.out.println(search(new int[]{-1,0,3,5,9,12}, 2));
    }

    public static int search(int[] nums, int target) {
        int l = 0 , r = nums.length;

        int medium ;
        while(l < r){
            medium = (l + r) / 2;
            if(nums[medium] < target){
                l = medium + 1;
            }else{
                r = medium;
            }
            System.gc();
        }
        if(nums[l] != target)return -1;

        return l;
    }
}
