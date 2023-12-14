package YandexAlgoritm4.WarmUp.G;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] field = new int[n + 1][m + 1];
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < m + 1; j++) {
                field[i][j] = scanner.nextInt();
            }
        }
        int max = 0;
        for(int i = 1; i < n + 1; i++){
            for(int j = 1; j < m + 1; j++){
                if(field[i][j] != 0){
                    field[i][j] = Math.min(field[i-1][j-1], field[i][j-1]);
                    field[i][j] = Math.min( field[i][j],field[i-1][j]) + 1;
                }
                max = Math.max(max , field[i][j]);
            }
        }
        System.out.println(max);

    }
}
