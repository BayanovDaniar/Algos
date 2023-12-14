package Fun.oct16;

import java.io.*;
import java.util.Scanner;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Interactor {
    public static void main(String[] args) throws IOException {

        PrintWriter printWriter = new PrintWriter(System.out);
        FastReader fastReader = new FastReader();
        int r = fastReader.nextInt();
        int i = fastReader.nextInt();
        int c = fastReader.nextInt();


        if (i == 0) {
            printWriter.print((r != 0 ? 3 : c));
            printWriter.flush();

        } else if (i == 1) {
            printWriter.print(c);
            printWriter.flush();
        } else if (i == 4) {
            printWriter.print((r != 0 ? 3 : 4));
            printWriter.flush();
        } else if (i == 6) {
            printWriter.print(0);
            printWriter.flush();
        } else if (i == 7) {
            printWriter.print(1);
            printWriter.flush();
        } else {
            printWriter.print(i);
            printWriter.flush();
        }
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
