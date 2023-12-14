package YandexAlgoritm4.WarmUp.I;

import java.util.Scanner;
import java.util.Stack;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        Stack<Character> stack = new Stack<>();

        if(s.length()%2 != 0) {
            System.out.println("no");
            System.exit(0);
        }

        for(int i = 0; i < s.length();i++){
            char symbol = s.charAt(i);
            if(stack.empty()) {
                if(symbol == '}' || symbol == ')' || symbol == ']'){
                    System.out.println("no");
                    System.exit(0);
                }
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
            }else {
                System.out.println("no");
                System.exit(0);
            }
        }
        if( stack.empty()) {
            System.out.println("yes");
            System.exit(0);
        }else {
            System.out.println("no");
            System.exit(0);
        }
    }
}
