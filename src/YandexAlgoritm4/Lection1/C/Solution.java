package YandexAlgoritm4.Lection1.C;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] a = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N ; i++){
            a[i] = Integer.parseInt(st.nextToken());
        }

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int [] b = new int[M];
        for(int i = 0; i < M ; i++){
            b[i] = Integer.parseInt(st.nextToken());
        }
        for(int i : merge(a , b)){
            System.out.print(i + " ");
        }

    }


    static int[] merge(int[] a, int[] b){
        int[] result = new int[a.length + b.length];
        int i = 0, j = 0, k = 0;
        for(; i < a.length && j < b.length; k++){
            if(a[i] <= b[j]){
                result[k] = a[i++];
            }else{
                result[k] = b[j++];
            }
        }
        while (i < a.length) result[k++] = a[i++];
        while (j < b.length) result[k++] = b[j++];
        return result;
    }
}
