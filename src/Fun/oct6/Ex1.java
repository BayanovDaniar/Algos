package Fun.oct6;

import java.util.Arrays;

public class Ex1 {
    public static void main(String[] args) {

        int[] array  = new int[]{-1,1,0,-3,3};
        System.out.println(Arrays.toString(productExceptSelf(array)));

    }


    public static int[] productExceptSelf(int[] nums) {

        int[] array = new int[nums.length];

        for(int i = 0; i < nums.length; i++){
            array[i] = multiplication(Arrays.copyOfRange(nums, 0 , i))
                    * multiplication(Arrays.copyOfRange(nums, i+1, nums.length));
        }
        return array;
    }

    public static int multiplication(int [] array){
        int sum = 1;
        for(int i : array){
            sum *= i;
        }
        return sum;
    }
}
