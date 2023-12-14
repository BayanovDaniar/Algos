package Leetcode.BinarySearch.MedianofTwoSortedArrays4;

public class Solution {

    public static void main(String[] args) {
        int[] nums1 = new int[]{1,2,3,5,6};
        int[] nums2 = new int[]{4};

        System.out.println(findMedianSortedArrays(nums1, nums2));
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) return findMedianSortedArrays(nums2, nums1);
        if (nums1.length == 0) return nums2.length % 2 != 0 ?  nums2[nums2.length / 2]
                : ((double)nums2[nums2.length / 2] + nums2[nums2.length / 2 - 1]) / 2.0;


        int x = nums1.length;
        int y = nums2.length;

        int l = 0;
        int r = x;
        while (l <= r) {
            int leftX = (l + r) / 2;
            int leftY = (x + y + 1) / 2 - leftX;

            int maxLeftX = (leftX == 0) ? Integer.MIN_VALUE : nums1[leftX - 1];
            int maxLeftY = (leftY == 0) ? Integer.MIN_VALUE : nums2[leftY - 1];
            int minRightX = (leftX == x) ? Integer.MAX_VALUE : nums1[leftX];
            int minRightY = (leftY == y) ? Integer.MAX_VALUE : nums2[leftY];

            if (maxLeftX <= minRightY && maxLeftY <= minRightX) {
                return (x + y) % 2 != 0 ? Math.max(maxLeftX, maxLeftY) :
                        ((double) Math.max(maxLeftX, maxLeftY)
                                + Math.min(minRightX, minRightY)) / 2.0;
            } else if (maxLeftX > minRightY) {
                r = leftX;
            } else {
                l = leftX + 1;
            }
        }
        throw new IllegalArgumentException("WTF ?");
    }

}
