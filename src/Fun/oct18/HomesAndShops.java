package Fun.oct18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class HomesAndShops {
    public static void main(String[] args) {
        FastReader fastReader = new FastReader();
//        int []n = new int[]{1, 2, 1, 2, 1, 2, 1, 2, 1,2};
//        int []n = new int[]{0, 0, 1, 1, 0, 1, 0, 0, 1,0};
        int []n = new int[10];
        for(int i = 0; i < 10; i++){
            n[i] = fastReader.nextInt();
        }

        int max = 0;
        for(int i = 0; i < 10; i++){
            if(n[i] == 1){
                int counter1 = 1;
                int counter2 = 0;
                int i1 = i-1;
                int i2 = i;
                boolean flag1 = false;
                boolean flag2 = false;
                while(i1 >= 0){
                    if(n[i1] != 2)counter1++;
                    else {
                        flag1 = true;
                        break;
                    }
                    i1--;
                }
                while(i2 < 10){
                    if(n[i2] != 2)counter2++;
                    else {
                        flag2 = true;
                        break;
                    }
                    i2++;
                }
                if(flag1 && flag2){
                    if(counter1 > counter2){
                        if(counter2 > max) max = counter2;
                    }else{
                        if(counter1 > max) max = counter1;
                    }
                }else if(flag1){
                    if(counter1 > max) max = counter1;
                }else if(flag2){
                    if(counter2 > max) max = counter2;
                }


            }
        }

        System.out.println(max);

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
