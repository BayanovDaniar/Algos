package YandexAlgoritm4.Lection2.A;

import java.util.Scanner;

public class Hash {
    final static int p = (int) (10e8 + 7);
    final static int x_ = 257;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        long[][] a = doHash(s);
        int n = scanner.nextInt();
        int[][] array = new int[n][3];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                array[i][j] = scanner.nextInt();
            }
        }

        for (int[] i : array) {
            if (compare(a[0], a[1], i[0], i[1], i[2])) System.out.println("yes");
            else System.out.println("no");
        }

    }

    public static long[][] doHash(String s) {

        long[] x = new long[s.length() + 1];
        long[] h = new long[s.length() + 1];
        x[0] = 1;
        s = " " + s;

        for (int i = 1; i < s.length(); i++) {
            h[i] = (h[i - 1] * x_ + s.charAt(i)) % p;
            x[i] = (x[i - 1] * x_) % p;
        }
        return new long[][]{x, h};
    }

    public static boolean compare(long[] x, long[] h, int L, int A, int B) {
//        A++;
//        B++;
        return (h[A + L ] + h[B ] * x[L]) % p == (h[B + L] + h[A ] * x[L]) % p;
    }
}
