package Leetcode.BinarySearch.Searcha2DMatrix74;

public class Solution {
    public static void main(String[] args) {
        int [][] matrix = new int[][]{{1,3,5,7},{10,11,16,20}, {23,30,34,60}};
        System.out.println(searchMatrix(matrix, 11));
    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        for (int[] ints : matrix) {
//            if(ints[ints.length-1] < target) continue;

            if (binSearch(ints, target)) return true;
        }
        return false;
    }

    public static boolean binSearch(int[] array, int target) {
        int l = 0, r = array.length - 1, middle;

        while (l < r) {
            middle = (l + r) / 2;
            if (array[middle] < target) {
                l = middle + 1;

            } else {
                r = middle;
            }
        }
        return array[l] == target;
    }
}
