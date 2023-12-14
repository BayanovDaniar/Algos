package YandexAlgoritm4.WarmUp.H;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        int n = scanner.nextInt();

        System.out.println( a > Math.ceil(b/n) ? "Yes" : "No");
    }


}
