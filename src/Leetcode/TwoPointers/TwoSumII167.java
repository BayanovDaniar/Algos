package Leetcode.TwoPointers;

import java.util.Arrays;

public class TwoSumII167 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{2,7,11,15},9)));
    }

    public static int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        while(left < right){
            if(numbers[left]+numbers[right] < target){
                left++;
            }else if(numbers[left]+numbers[right] > target){
                right--;
            }else{
                break;
            }
        }
        return new int[]{left+1, right+1};
    }
}
