package YandexAlgoritm4.Lection2.C;

import java.util.Scanner;

public class Solution {
    static long p = (long) 10e8 + 7;
    static long x_ = 257;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        long[][] array = hash(s);
        long[] x = array[0];
        long[] h = array[1];

        int[] zFunc = new int[s.length()];
        int f;
        for (int i = 1; i < s.length(); i++) {
//            f = 1;
//            while (f + i <= s.length()) {
//                if (isEqual(0, i, f, x, h)) zFunc[i]++;
//                else break;
//                f++;
//            }
            zFunc[i] = binSearch(s.length(), i, x, h);
        }
        for (int i : zFunc) {
            System.out.print(i + " ");
        }

    }

    public static long[][] hash(String s) {
        s = " " + s;
        long[] x = new long[s.length()];
        long[] h = new long[s.length()];
        x[0] = 1;
        for (int i = 1; i < s.length(); i++) {
            h[i] = (h[i - 1] * x_ + s.charAt(i)) % p;
            x[i] = (x[i - 1] * x_) % p;
        }
        return new long[][]{x, h};
    }

    public static boolean isEqual(int a, int b, int s, long[] x, long[] h) {
        return (h[a + s] + h[b] * x[s]) % p == (h[b + s] + h[a] * x[s]) % p;
    }

    public static int binSearch(int length, int i, long[] x, long[] h) {
        int l = 0;
        int r = length - i;
        int mid;
        while (l < r) {
            mid = (l + r + 1) / 2;
            if (isEqual(0, i, mid, x, h)) {
                l = mid;
            } else {
                r = mid - 1;
            }
        }
        return l;
    }

}
