package Leetcode.SlidingWindow.MinimumSizeSubarraySum209;

public class Solution {
    public static void main(String[] args) {
        System.out.println(minSubArrayLen(7, new int[]{2,3,1,2,4,3}));
        System.out.println(minSubArrayLen(4, new int[]{1, 4, 4}));
        System.out.println(minSubArrayLen(11, new int[]{1, 1, 1, 1, 1, 1, 1, 1}));
    }

    public static int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int right = 0;
        int sum = 0;
        int minSize = Integer.MAX_VALUE;
        while (right < nums.length) {
            sum += nums[right];
            while (sum >= target && left <= right) {
                minSize = Math.min(minSize, right - left + 1);
                sum -= nums[left++];
            }
            right++;
        }
        return minSize == Integer.MAX_VALUE ? 0 : minSize;
    }
}
