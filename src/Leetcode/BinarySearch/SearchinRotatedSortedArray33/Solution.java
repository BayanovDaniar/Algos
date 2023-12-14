package Leetcode.BinarySearch.SearchinRotatedSortedArray33;

public class Solution {
    public static void main(String[] args) {
        System.out.println(search(new int[]{1,3}, 3));
    }

    public static int search(int[] nums, int target) {
        int l = 0, r = nums.length - 1, mid;

        while(l < r){
            mid = (r + l) / 2;
            if(nums[r] < nums[mid]){
                l = mid + 1;
            }else{
                r= mid;
            }
        }
        if(nums[l] <= target && target <= nums[nums.length - 1]){
            r = nums.length - 1;
        }else{
            r = l - 1;
            l = 0;
        }
        while(l < r){
            mid = (r + l) / 2;
            if(nums[mid] < target){
                l = mid + 1;
            }else{
                r = mid;
            }
        }

        if(target == nums[l]) return l;

        return -1;
    }
}
