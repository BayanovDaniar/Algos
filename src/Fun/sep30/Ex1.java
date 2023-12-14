package Fun.sep30;

import java.util.Arrays;
import java.util.Random;

public class Ex1 {
    public static void main(String[] args) {
        int [] array = {12,14,32,21,5,123};
        System.out.println(search(array, 123));

        // binary search

        Arrays.sort(array);
        System.out.println(Arrays.binarySearch(array, 123));
        System.out.println(Arrays.binarySearch(array, 0)); // returns (-index - 1) where element should be inserted.

        array = new int[]{12,4,65,2,76,2, 43};
        System.out.println(Arrays.toString(array));
        shake(array);
        System.out.println(Arrays.toString(array));

        shuffle(array);
        System.out.println(Arrays.toString(array));

        Random random = new Random();
        byte [] bytesArray = {12,32,1,43,2,3,4};
        random.nextBytes(bytesArray); //
        System.out.println(Arrays.toString(bytesArray));

        for(int i = 0; i < 10; i++){
            double x = Math.random() ;
            //System.out.print(x + " : ");
            //System.out.println((int) (x * 3)); // Interesting. Math.random * array.length [0;array.length-1]
        }

        int [] array2 = Arrays.copyOf(array, array.length); // copying array
        int [] array3 = Arrays.copyOfRange(array, 0 , array.length/2);

        System.arraycopy(array, 0 , array2, 0, array.length); // also copying array
        System.out.println(Arrays.toString(array2));

        int [][] multiArray = {{1,2,3,4}, {1,2,3,4}, {5,6,7,8}};
        System.out.println(Arrays.deepToString(multiArray));

        // при простом копировании двумерного массива копируются ссылки !

        System.out.println(Arrays.equals(array, array2));
        System.out.println(Arrays.equals(array,0, 5, array2, 0 , 5));

        // для многомерных массивов deepEquals

    }

    public static void shake(int [] array){
        for(int i = 0; i < array.length / 2; i ++){
            int k = array[array.length-i-1];
            array[array.length - i - 1] = array[i];
            array[i] = k;
        }
    }

    public static void shuffle(int [] array){
        Random random = new Random();
        for(int i = 0; i < array.length / 2; i ++){
            int k = array[i];
            int index = random.nextInt(array.length);
            array[i] = array[index];
            array[index] = k;
        }
    }


    public static int search(int [] array, int x){
        var j = 0;
        for(var i : array){
            if(i == x){
                return j;
            }
            j++;
        }
        return -1;
    }
}
