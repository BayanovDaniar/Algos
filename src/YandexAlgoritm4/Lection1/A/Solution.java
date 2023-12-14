package YandexAlgoritm4.Lection1.A;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
            array[i] = scanner.nextInt();
        }
        int predicate = scanner.nextInt();

        int left = partition(array, 0, array.length - 1, predicate);

        System.out.println(left);
        System.out.println(array.length - left);


    }

    public static int partition(int[] array, int left, int right, int predicate) {
        while (left < right) {
            while (left < right && array[left] < predicate) left++;
            while (left < right && array[right] >= predicate) right--;

            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
        }
        if(left < array.length && array[left] < predicate) left++;

        return left;
    }
}
