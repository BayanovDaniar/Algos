package Fun.oct16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Triangle {
    public static void main(String[] args) {
        FastReader fastReader = new FastReader();

        double d = fastReader.nextDouble();
        int x1 = fastReader.nextInt();
        int y1 = fastReader.nextInt();

        double distB = Math.sqrt(Math.pow(x1 - d, 2) + Math.pow(y1,2));
        double distC = Math.sqrt(Math.pow(y1 - d, 2) + Math.pow(x1,2));
        double distA = Math.sqrt(Math.pow(y1, 2) + Math.pow(x1,2));

        double squareABC =  (d * d) / 2;
        double polPerACX = (distA + distC + d) / 2;
        double squareACX = Math.sqrt(polPerACX * (polPerACX - distA) * (polPerACX - distC) * (polPerACX - d));
        double polPerABX = (distA + distB + d) / 2;
        double squareABX = Math.sqrt(polPerABX * (polPerABX - distA) * (polPerABX - distB) * (polPerABX - d));
        double polPerCBX = (distC + distB + (Math.sqrt(d*d+d*d))) / 2;
        double squareCBX = Math.sqrt(polPerCBX * (polPerCBX - distC) * (polPerCBX - distB) * (polPerCBX - (Math.sqrt(d*d+d*d))));

        if(((x1 - d)*(d) - (y1) * (-d) == 0) && (0 <= x1 &&  x1< d && 0 <= y1 && y1 <= d) ){
            System.out.println(0);
        }else if(Math.abs(squareABC - (squareABX + squareACX + squareCBX)) < 0.00001){
            System.out.println(0);
        }else{
            if(distA <= distB && distA <= distC) System.out.println(1);
            else if(distB <= distA && distB <= distC) System.out.println(2);
            else System.out.println(3);
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
