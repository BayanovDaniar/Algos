package Leetcode.BinarySearch.FindSmallestLetterGreaterThanTarget744;

public class Solution {

    public static void main(String[] args) {
        System.out.println(nextGreatestLetter(new char[]{'c','f','j'}, 'a'));
    }

    public static char nextGreatestLetter(char[] letters, char target) {
        int l = 0; int r = letters.length - 1;
        int medium;
        while(l < r){
            medium = (l+r) / 2;
            if(letters[medium] <= target){
                l = medium + 1;
            }else{
                r = medium;
            }
        }
        if(letters[l] > target) return letters[l];
        return letters[0];
    }
}
