package YandexCup.SmartCat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) {

        FastReader fastReader = new FastReader();
        int n = fastReader.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = fastReader.nextInt();
        }

        int currentmin = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] == currentmin + 1) {
                currentmin = a[i];
            } else if (a[i] < currentmin) {
                currentmin = a[i];
            }
        }

        System.out.println(currentmin);
    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader()
        {
            br = new BufferedReader(
                    new InputStreamReader(System.in));
        }

        String next()
        {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() { return Integer.parseInt(next()); }

        long nextLong() { return Long.parseLong(next()); }

        double nextDouble()
        {
            return Double.parseDouble(next());
        }

        String nextLine()
        {
            String str = "";
            try {
                if(st.hasMoreTokens()){
                    str = st.nextToken("\n");
                }
                else{

                    str = br.readLine();
                }
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}
