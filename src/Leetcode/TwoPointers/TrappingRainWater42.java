package Leetcode.TwoPointers;

public class TrappingRainWater42 {
    public static void main(String[] args) {
        System.out.println(trap2(new int[]{0,1,0,2,1,0,1,3,2,1,2,1}));
    }

    public static int trap2(int[] height) {
        if(height.length < 2) return 0;
        int left = 0, right = height.length - 1;
        int maxLeft = height[left], maxRight = height[right], result = 0;
        while(left < right){
            if(maxLeft < maxRight){
                left++;
                maxLeft = Math.max(maxLeft, height[left]);
                result += maxLeft - height[left];
            }else {
                right--;
                maxRight = Math.max(maxRight, height[right]);
                result += maxRight - height[right];
            }
        }
        return result;
    }

    public static int trap(int[] height) {
        if(height.length < 2) return 0;

        int max = 0;
        int maxIndex = 0;
        for(int i = 0; i <height.length; i++){
            if(height[i] > max) {
                max = height[i];
                maxIndex = i;
            }
        }

        int result = 0;
        int maxLeft = 0;
        for(int i = 0; i <= maxIndex; i ++){
            maxLeft = Math.max(maxLeft, height[i]);
            result += maxLeft - height[i];
        }
        int maxRight = 0;
        for(int i = height.length - 1; i >= maxIndex; i --){
            maxRight = Math.max(maxRight, height[i]);
            result += maxRight - height[i];
        }

        return result;
    }
}
