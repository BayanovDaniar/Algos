package Leetcode.BinarySearch.KokoEatingBananas875;

public class Solution {
    public static void main(String[] args) {
        System.out.println(minEatingSpeed(new int[]{30,11,23,4,20}, 6));
    }

    public static int minEatingSpeed(int[] piles, int h) {

        long s = 0;
        int n = piles.length;
        for(int i : piles){
            s += i;
        }

        int l = (int) ((s-1) / h + 1);
        int r = (int) ((s-h) / (h - n + 1) + 1), medium;

        while(l < r){
            medium = (l + r) / 2;
            if(checkCondition(piles, medium, h)){
                r = medium;
            }else {
                l = medium + 1;
            }
        }
        return l;
    }

    public static boolean checkCondition(int [] array, int n, int h){
        int result = 0;
        for (int j : array) {
            result += Math.ceil((double) j / n);
        }

        return result <= h;
    }



}
