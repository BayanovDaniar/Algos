package Fun.sep29;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Ex3 {
    public static void main(String[] args) {
        var i = new int[]{12, 313, 13};

        int [] i1 = {12,3113,13};

        int [][] i2 = {{1,2,3,4}, {1,2,3,4}, {1,2,3,4}};
        System.out.println(i2[0][1]);

        int [][] i3 = new int[2][];
        int [][] i4 = new int[2][3];


        int[] i5 = new int[12];

        Arrays.fill(i5, 0, 5 , 12);
        System.out.println(Arrays.toString(i5));
        Arrays.fill(i5,12);
        System.out.println(Arrays.toString(i5));

        Random random = new Random(); // Doesn't work
        Arrays.fill(i5, random.nextInt(10));
        System.out.println(Arrays.toString(i5));


        Integer []  i6 = {12,12,13, 1,4,5};
        Arrays.sort(i6, Collections.reverseOrder());
        System.out.println(Arrays.toString(i6));


    }
}
