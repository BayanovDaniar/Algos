package Leetcode.Optionally.BackspaceStringCompare844;

import java.util.Stack;

public class Solution {
    public static void main(String[] args) {
        System.out.println(backspaceCompare2("bxj##tw", "bxo#j##tw"));
    }

    public static boolean backspaceCompare2(String s, String t) {
        int realSymbolInS = countRealSymbol(s);
        int realSymbolInT = countRealSymbol(t);

        if (realSymbolInT != realSymbolInS) return false;
        if (realSymbolInT == 0) return true;

        int counterI = 0; // count # in string S
        int counterJ = 0; // count # in string J

        for (int i = s.length() - 1, j = t.length() - 1; j >= 0 && i >= 0; ) {
            if (s.charAt(i) == '#' || t.charAt(j) == '#') {
                if (s.charAt(i) == '#') {
                    counterI++;
                    i--;
                }
                if (t.charAt(j) == '#') {
                    counterJ++;
                    j--;
                }
            } else if (counterI != 0 || counterJ != 0) {
                if (counterI != 0) {
                    i--;
                    counterI --;
                }else {
                    j--;
                    counterJ--;
                }
            } else {
                if (s.charAt(i) != t.charAt(j)) return false;
                i--;
                j--;
            }
        }
        return true;
    }

    public static int countRealSymbol(String s){
        int counter = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '#') {
                counter++;
            } else if (!(i < counter) && (counter - 1 >= 0)) {
                counter--;
            }
        }
        return counter;
    }

    public static boolean backspaceCompare(String s, String t) {
        Stack<Character> stackS = new Stack<>();
        Stack<Character> stackT = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '#') {
                if (!stackS.empty()) stackS.pop();
            } else {
                stackS.push(s.charAt(i));
            }
        }

        for (int i = 0; i < t.length(); i++) {
            if (t.charAt(i) == '#') {
                if (!stackT.empty()) stackT.pop();
            } else {
                stackT.push(t.charAt(i));
            }
        }

        if (stackS.size() != stackT.size()) return false;

        while (!stackS.empty()) {
            if (stackS.pop() != stackT.pop()) return false;
        }
        return true;
    }
}
