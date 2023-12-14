package YandexAlgoritm4.Lection1.B;

import java.util.Scanner;

public class QuickSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
            array[i] = scanner.nextInt();
        }

        quickSort(array, 0, array.length - 1);



        for (int i : array) {
            System.out.print(i + " ");
        }
    }


    public static void quickSort(int[] array, int l, int r){
        if(l >= r) return;
        int[] temp  = partition(array, l, r);
        quickSort(array, 0, temp[0] - 1);
        quickSort(array, temp[1], r);
    }

    public static int[] partition(int[] array, int l, int r){
        int x = array[r];
        int E = l, G = l, N = l;
        while(N <= r){
            if(array[N] < x){
                int temp = array[N];
                array[N] = array[G];
                array[G] = array[E];
                array[E] = temp;
                G++;
                N++;
                E++;
            }else if(array[N] == x){
                int temp = array[N];
                array[N] = array[G];
                array[G] = temp;
                G++;
                N++;
            }else{
                N++;
            }
        }
        return new int[]{E,G};
    }
}
