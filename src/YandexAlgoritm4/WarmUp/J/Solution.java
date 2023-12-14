package YandexAlgoritm4.WarmUp.J;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        String[] ans = new String[t];

        for (int i = 0; i < t; i++) {
            long n = scanner.nextInt();
            long a = scanner.nextInt();
            long b = scanner.nextInt();
            System.out.println("n % a : " + n % a);
            System.out.println("n / a : " + n / a);
            System.out.println("b - a : " + (b-a));
            System.out.println("Itog " +  ((n % a) - ((n / a) * (b - a))));
            if (n % a == 0 || (n % a) - ((n / a) * (b - a)) <= 0) {
                ans[i] = "YES";
            } else {
                ans[i] = "NO";
            }
        }

        for (String s : ans) {
            System.out.println(s);
        }
    }
}
