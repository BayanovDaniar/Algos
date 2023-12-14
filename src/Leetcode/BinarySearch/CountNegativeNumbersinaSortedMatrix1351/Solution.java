package Leetcode.BinarySearch.CountNegativeNumbersinaSortedMatrix1351;

public class Solution {
    public static void main(String[] args) {

    }



    public static int countNegatives(int[][] grid) {
        int counter = 0;
        for (int[] ints : grid) {
            counter += binSearch(ints);
        }

        return counter;
    }

    public static int binSearch(int [] array){
        int l = 0, r = array.length - 1, medium;

        while(l < r){
            medium = (l + r) / 2;
            if(array[medium] >= 0){
                l = medium + 1;
            }else{
                r = medium;
            }
        }
        if(array[l] < 0) return array.length - l;
        return 0;
    }

}
