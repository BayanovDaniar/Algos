package Leetcode.Stack.ValidParentheses20;

import java.util.Stack;

public class Solution {
    public static void main(String[] args) {
        System.out.println(isValid("(()))"));
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < s.length();i++){
            if(s.length()%2 != 0)return false;

            char symbol = s.charAt(i);
            if(stack.empty()) {
                if(symbol == '}' || symbol == ')' || symbol == ']') return false;
                stack.push(s.charAt(i));
                continue;
            }
            char symbolInStack = stack.peek();
            if(symbol == '{'){
                stack.push(symbol);
                continue;
            }else if(symbol == '['){
                stack.push(symbol);
                continue;
            }else if(symbol == '('){
                stack.push(symbol);
                continue;
            }

            if(symbol == '}' && symbolInStack == '{'){
                stack.pop();
            }else if(symbol == ')' && symbolInStack == '('){
                stack.pop();
            }else if(symbol == ']' && symbolInStack == '['){
                stack.pop();
            }else return false;
        }
        return stack.empty();
    }
}
