package Leetcode.ArraysHashing.ValidSudoku36;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        char[][] chars = {{'5','3','.','.','7','.','.','.','.'}
                        ,{'6','.','.','1','9','5','.','.','.'}
                        ,{'.','9','8','.','.','.','.','6','.'}
                        ,{'8','.','.','.','6','.','.','.','3'}
                        ,{'4','.','.','8','.','3','.','.','1'}
                        ,{'7','.','.','.','2','.','.','.','6'}
                        ,{'.','6','.','.','.','.','2','8','.'}
                        ,{'.','.','.','4','1','9','.','.','5'}
                        ,{'.','.','.','.','8','.','.','7','9'}};

        char[][] chars1 = {{'8','3','.','.','7','.','.','.','.'}
                        ,{'6','.','.','1','9','5','.','.','.'}
                        ,{'.','9','8','.','.','.','.','6','.'}
                        ,{'8','.','.','.','6','.','.','.','3'}
                        ,{'4','.','.','8','.','3','.','.','1'}
                        ,{'7','.','.','.','2','.','.','.','6'}
                        ,{'.','6','.','.','.','.','2','8','.'}
                        ,{'.','.','.','4','1','9','.','.','5'}
                        ,{'.','.','.','.','8','.','.','7','9'}};
        
        System.out.println(isValidSudoku(chars));
        System.out.println(isValidSudoku(chars1));
    }

    public static boolean isValidSudoku(char[][] board) {
        Set<Integer> line = new HashSet<>();
        Set<Integer>[] col = new Set[9];
        Set<Integer>[][] table = new Set[3][3];

        List<Set<Integer>> box = new ArrayList<>();
        for(int i = 0; i < 9; i++){
            col[i] = new HashSet<>();
        }

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                table[i][j] = new HashSet<>();
            }
        }

        

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if(board[i][j] != '.'){
                    int curVal = Integer.parseInt(String.valueOf(board[i][j]));
                    if(line.contains(curVal))return false;
                    if(col[j].contains(curVal)) return false;
                    if(table[i/3][j/3].contains(curVal)) return false;

                    line.add(curVal);
                    col[j].add(curVal);
                    table[i/3][j/3].add(curVal);
                }
            }
            line.clear();
        }

        return true;
    }
}
