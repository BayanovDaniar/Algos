package YandexAlgoritm4.Lection2.D;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(stringTokenizer.nextToken());
        int M = Integer.parseInt(stringTokenizer.nextToken());
        stringTokenizer = new StringTokenizer(br.readLine());
        int[] array = new int[N];
        for(int i = 0; i < N; i++){
            array[i] = Integer.parseInt(stringTokenizer.nextToken());
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(N);

        for(int i = 1; i <= (N+1)/2 ; i++){
            int l = i -1;
            int r = i;
            while(l >= 0 && r < N){
                if(array[l] == array[r]){
                    if(l == 0) arrayList.add(N-i);
                }else break;
                l--;r++;
            }
        }


        for(int i = arrayList.size()-1; i >= 0; i--){
            System.out.print(arrayList.get(i) + " ");
        }
    }
}
