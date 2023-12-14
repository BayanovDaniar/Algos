package Leetcode.TwoPointers;

import java.util.Arrays;

public class ContainerWithMostWater11 {
    public static void main(String[] args) {
        System.out.println(maxArea(new int[]{1,8,6,2,5,4,8,3,7}));
    }

    public static int maxArea(int[] height) {
        if(height.length == 2) return Math.min(height[0],height[1]);

        int max = 0;
        //find the maximum height value
        for(int i : height){
            if(i > max){
                max = i;
            }
        }

        int i = 0;
        int j = height.length - 1;
        int [] values = new int[max ]; // array for storing areas
        int levelIndex = 0;

        //iterate each time increasing the water level
        while (i < j){
            if(height[i] <= levelIndex){
                i++;
            }else if(height[j] <= levelIndex){
                j--;
            }else{
                values[levelIndex++] = (j - i) * levelIndex;
            }
        }

        int answer = 0;
        //find the maximum area value
        for(int temp : values){
            if (temp > answer) answer = temp;
        }

        return answer;
    }
}
