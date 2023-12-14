package Leetcode.SlidingWindow.NumberofSubarrays1343;

public class Solution {
    public static void main(String[] args) {
        System.out.println(numOfSubarrays(new int[]{2,2,2,2,5,5,5,8}, 3, 4));
        System.out.println(numOfSubarrays(new int[]{11,13,17,23,29,31,7,5,2,3}, 3, 5));
    }

    public static int numOfSubarrays(int[] arr, int k, int threshold) {
        double avg = 0;
        int counter = 0;
        for(int j = 0; j < arr.length; j++){

            if(j >= k) {
                avg = (avg - arr[j-k]) + arr[j];
                if(avg/3 >=  threshold) counter++;
            }else {
                avg += arr[j];
                if(j == k - 1 && avg / 3 >= threshold) counter++;
            }
        }
        return counter;
    }
}
