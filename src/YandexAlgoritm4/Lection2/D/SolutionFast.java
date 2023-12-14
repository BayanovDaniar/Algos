package YandexAlgoritm4.Lection2.D;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class SolutionFast {
    static int x_ = 10;
    static int p = (int) 10e8 + 7;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int[] reversedArray = new int[N];
        for (int i = 0; i < N; i++) {
            reversedArray[i] = arr[N - i - 1];
        }
        long[][] arrHelp1 = hash(arr);
        long[] h1 = arrHelp1[0];
        long[] x1 = arrHelp1[1];
        long[][] arrHelp2 = hash(reversedArray);
        long[] h2 = arrHelp2[0];

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(arr.length);

        int j = arr.length - 2;
        for (int i = 0; i < (arr.length ) / 2; i++) {
            if (isEqual(h1, x1, h2, 0, j , i + 1)) arrayList.add(arr.length - (i + 1));
            j -= 2;
        }

        for (int i = arrayList.size() - 1; i >= 0; i--) {
            System.out.print(arrayList.get(i) + " ");
        }

    }

    static long[][] hash(int[] arr) {
        long[] h = new long[arr.length + 1];
        long[] x = new long[arr.length + 1];
        x[0] = 1;

        for (int i = 1; i <= arr.length; i++) {
            h[i] = (h[i - 1] * x_ + arr[i - 1]) % p;
            x[i] = (x[i - 1] * x_) % p;
        }

        return new long[][]{h, x};
    }

    static boolean isEqual(long[] h1, long[] x1, long[] h2, int p1, int p2, int len) {
        return (h1[p1 + len] + h2[p2] * x1[len]) % p == (h2[p2 + len] + h1[p1] * x1[len]) % p;
    }
}
