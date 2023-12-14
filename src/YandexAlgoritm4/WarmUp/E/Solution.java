package YandexAlgoritm4.WarmUp.E;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bi.readLine());

        int []array = new int[n];
        int[] answer = new int[n];

        String[] line = bi.readLine().split(" ");

        int hi = 0;
        for (String numStr: line){
            array[hi++] = Integer.parseInt(numStr);
        }
        bi.close();

        answer[0] = 0;
        for(int i = 0; i < n; i++){
            answer[0] += Math.abs(array[0]-array[i]);
        }

        for(int i = 1; i < n; i++){
            int rightSum = answer[i-1] - (Math.abs(array[i-1] - array[i]) * (n - (i+1)) );
            rightSum = rightSum + (Math.abs(array[i-1] - array[i]) * (i-1));
            answer[i] = rightSum;
        }

        for(int i : answer){
            System.out.print(i + " ");
        }

    }
}
