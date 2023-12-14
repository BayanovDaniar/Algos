package YandexAlgoritm4.Lection2.E;

import java.util.Scanner;

public class Solution {
    static long x_ = 258;
    static long p = (long) 10e8 + 7;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        StringBuilder stringBuilder = new StringBuilder(s).reverse();
        String sReversed = stringBuilder.toString();
        long[][] ar1 = hash(s);
        long[][] ar2 = hash(sReversed);
        long[] x = ar1[0];
        long[] h1 = ar1[1];
        long[] h2 = ar2[1];
        long ans = 0;
        for (double i = 0.5; i < s.length(); i += 0.5) {
            int len = (int) (Math.min(Math.ceil(i), s.length() - 1 - Math.floor(i)) + 1);
            ans += binSearch(x, h1, h2, (int)Math.floor(i), (int)Math.floor(s.length() - i - 1), len) - 1;
        }
        ans += s.length();
        System.out.println(ans);
    }


    public static long[][] hash(String s) {
        s = " " + s;
        long[] x = new long[s.length()];
        long[] h = new long[s.length()];
        x[0] = 1;
        for (int i = 1; i < s.length(); i++) {
            x[i] = (x[i - 1] * x_) % p;
            h[i] = (h[i - 1] * x_ + s.charAt(i)) % p;
        }
        return new long[][]{x, h};
    }

    public static boolean isEqual(long[] x, long[] h1, long[] h2, int p1, int p2, int length) {
        return (h1[p1 + length] + h2[p2] * x[length]) % p == (h2[p2 + length] + h1[p1] * x[length]) % p;
    }

    public static int binSearch(long[] x, long[] h1, long[] h2, int p1, int p2, int length) {
        int l = 1;
        int r = length;

        int mid;
        while (l < r) {
            mid = (l + r + 1) / 2;
            if (isEqual(x, h1, h2, p1, p2, mid)) {
                l = mid;
            } else {
                r = mid - 1;
            }
        }
        return l;
    }


}
