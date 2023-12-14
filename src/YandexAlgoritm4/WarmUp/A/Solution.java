package YandexAlgoritm4.WarmUp.A;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int [] array = new int[N];
        for(int i = 0; i < N; i++){
            array[i] = scanner.nextInt();
        }
        for(int i = 0; i < M; i++){
            int l = scanner.nextInt();
            int r = scanner.nextInt();
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            for(; l <= r; l++){
                if(array[l] < min){
                    min = array[l];
                }
                if(array[l] > max){
                    max = array[l];
                }

            }
            System.out.println(max == min  ? "NOT FOUND" : max);
        }
    }
}
