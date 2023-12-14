package YandexAlgoritm4.Lection1.E;


import java.io.IOException;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());
        String[] array = new String[N];
        int j;
        for (int i = 0; i < N; i++) {
            array[i] = scanner.nextLine();
        }
        System.out.println("Initial array: ");
        for (j = 0; j < N - 1; j++) {
            System.out.print(array[j] + ", ");
        }
        System.out.println(array[j]);
        int del = array[0].length() - 1;
        for (int i = 1; i <= array[0].length(); i++) {
            System.out.println("**********");
            System.out.println("Phase " + i);
            array = sort(array, del);
            del--;
        }
        System.out.println("**********");
        System.out.println("Sorted array:");
        for (j = 0; j < N - 1; j++) {
            System.out.print(array[j] + ", ");
        }
        System.out.println(array[j]);
    }

    static String[] sort(String[] array, int del) {
        String[] result = new String[array.length];
        int[] count = new int[10];
        for (String k : array) {
            count[Integer.parseInt(String.valueOf(k.charAt(del)))]++;
        }
        int[] pos = new int[10];
        for (int i = 1; i < 10; i++) {
            pos[i] = pos[i - 1] + count[i - 1];
        }
        for (String j : array) {
            result[pos[Integer.parseInt(String.valueOf(j.charAt(del)))]++] = j;
        }
        for (int i = 0, outIndex = 0; i < 10; i++) {
            System.out.print("Bucket " + i + ": ");
            if (count[i] == 0) {
                System.out.println("empty");
                continue;
            }
            int counter = 0;
            while (counter++ < count[i] - 1) {
                System.out.print(result[outIndex++] + ", ");
            }
            System.out.println(result[outIndex++]);
        }
        return result;
    }

}
