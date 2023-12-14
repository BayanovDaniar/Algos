package YandexAlgoritm4.Lection1.D;

public class Solution {

    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6, 7};

        System.out.println("Исходный массив:");
        printArray(arr);

        mergeSort(arr , arr.length);

        System.out.println("\nОтсортированный массив:");
        printArray(arr);
    }

    public static void merge(int[] a, int[] l, int[] r) {

        int lSize = l.length;
        int rSize = r.length;

        int i = 0, j = 0, k = 0;
        while (i < lSize && j < rSize) {
            if (l[i] <= r[j]) {
                a[k++] = l[i++];
            } else {
                a[k++] = r[j++];
            }
        }
        while (i < lSize) {
            a[k++] = l[i++];
        }
        while (j < rSize) {
            a[k++] = r[j++];
        }
    }

    public static void mergeSort(int[] a, int n) {
        if (n < 2) {
            return;
        }

        int mid = n / 2;
        int[] l = new int[mid];
        int[] r = new int[n - mid];

        System.arraycopy(a, 0, l, 0, mid);
        if (n - mid >= 0) System.arraycopy(a, mid, r, 0, n - mid);

        mergeSort(l, mid);
        mergeSort(r, n - mid);

        merge(a, l, r);
    }


    // Метод для печати массива
    public static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
