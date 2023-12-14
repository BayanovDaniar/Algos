package YandexAlgoritm4.WarmUp.B;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int m , n ;
        if(b != d){
            m = a * d + b * c;
            n = b * d;
        }else{
            m = a + c ;
            n = b;
        }

        while(euclid(m, n) != 1){
            int div = euclid(m,n);
            m = m / div;
            n = n / div;
        }
        System.out.println(m + " " + n);
    }

    public static int euclid(int a, int b){
        if(b == 0){
            return a;
        }
        return euclid(b, a % b);
    }
}
