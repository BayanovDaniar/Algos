package Fun.oct6;

import java.util.Arrays;

public class Ex2 {
    public static void main(String[] args) {
        int[] array  = new int[]{1,2,3,4};
        System.out.println(Arrays.toString(productExceptSelf(array)));
    }

    public static int[] productExceptSelf(int[] nums) {
        int[] prev = new int[nums.length];
        int[] post = new int[nums.length];

        int[] result = new int[nums.length];

        int multi = 1;
        for(int i = 0; i < nums.length; i++){
            multi *= nums[i];
            prev[i] = multi;
        }

        multi = 1;
        for(int i = nums.length - 1; i>0; i--){
            multi *= nums[i];
            post[i] = multi;
        }

        for(int i = 0; i < nums.length; i++){
            if(i == 0 ) result[i] = post[i+1];
            else if(i == nums.length - 1) result[i] = prev[i-1];
            else result[i] = post[i+1] * prev[i-1];
        }

        return result;
    }
}

