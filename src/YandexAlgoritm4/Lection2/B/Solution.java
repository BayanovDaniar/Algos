package YandexAlgoritm4.Lection2.B;

import java.util.Scanner;

public class Solution {
    static int x_ = 257;
    static int p = (int) (10e8 + 7);
//    static int p = 1_000_003;



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String l = scanner.nextLine();
        long[][] response = doHashString(l);
        long[] x = response[0];
        long[] h = response[1];
        int len = l.length() - 1;

        for (; len > 0; len--) {
            if (check(0, l.length() - len, len, x, h)) break;
        }

        System.out.println(len == 0 ? l.length() : l.length() - len);
    }


    public static long[][] doHashString(String s) {

        long[] x = new long[s.length() + 1];
        long[] h = new long[s.length() + 1];
        s = ' ' + s;
        x[0] = 1;

        for (int i = 1; i < s.length(); i++) {
            h[i] = ( h[i - 1] * x_ + s.charAt(i )) % p  ;
            x[i] = (x[i - 1] * x_) % p;
        }

        return new long[][]{x, h};
    }

    public static boolean check(int l, int r, int len, long[] x, long[] h) {
        l++;
        r++;
        return ((h[l + len - 1] + h[r - 1] * x[len]) % p) == ((h[r + len - 1] + h[l - 1] * x[len]) % p);
    }
}
