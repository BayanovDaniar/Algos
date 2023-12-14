package Leetcode.BinarySearch.FindFirstandLastPositionofElementinSortedArray34;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(searchRange(new int[]{}, 8)));
    }

    public static int[] searchRange(int[] nums, int target) {
        if(nums.length == 0) return new int[]{-1,-1};
        int l = 0, r = nums.length - 1, mid ;
        int[] answer = new int[2];

        while(l < r){
            mid = (l + r) / 2;
            if(nums[mid] < target){
                l = mid + 1;
            }else{
                r = mid;
            }
        }

        answer[0] = l;

        l = 0;
        r = nums.length - 1;

        while(l < r){
            mid = (l + r + 1) / 2;
            if(nums[mid] <= target){
                l = mid;
            }else {
                r = mid - 1;
            }
        }

        answer[1] = l;

        if(nums[answer[0]] != target){
            answer[0] = -1;
            answer[1] = -1;
        }

        return answer;
    }
}
