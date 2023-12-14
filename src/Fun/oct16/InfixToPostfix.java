package Fun.oct16;

import java.util.Stack;

public class InfixToPostfix {

    public static void main(String[] args) {
        String exp = "60+33*(1+4*5)*2/10";
        System.out.print(exp + " = ");
        System.out.println(calculate(exp));
    }

    public static String calculate(String s){
        s = infToPost(s);

        Stack<String> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);

            if (c == '+') {
                stack.push(String.valueOf(Double.parseDouble(stack.pop()) + Double.parseDouble(stack.pop())));
            } else if (c == '-') {
                double d = Double.parseDouble(stack.pop());
                stack.push(String.valueOf(Double.parseDouble(stack.pop()) - d));
            } else if (c == '*') {
                stack.push(String.valueOf(Double.parseDouble(stack.pop()) * Double.parseDouble(stack.pop())));
            } else if (c == '/') {
                double d = Double.parseDouble(stack.pop());
                stack.push(String.valueOf(Double.parseDouble(stack.pop()) / d));
            } else if (Character.isDigit(c)) {
                StringBuilder number = new StringBuilder();
                number.append(c);
                while (i+1 < s.length() && s.charAt(i+1)!= '$') {
                    number.append(s.charAt(++i));
                }
                i++;
                stack.push(number.toString());
            }
        }
        return stack.pop();

    }

    public static String infToPost(String exp) {
        Stack<Character> stack = new Stack<>();
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < exp.length(); i++) {
            char c = exp.charAt(i);
            if (stack.empty() && !Character.isDigit(c)) {
                stack.push(c);
                continue;
            }
            if (c == '+') {
                while (stack.peek() == '*' || stack.peek() == '/' || stack.peek() == '+' || stack.peek() == '-') {
                    answer.append(stack.pop());
                }
                stack.push(c);
            } else if (c == '-') {
                while (stack.peek() == '*' || stack.peek() == '/' || stack.peek() == '+' || stack.peek() == '-') {
                    answer.append(stack.pop());
                }
                stack.push(c);
            } else if (c == '*') {
                while (stack.peek() == '*' || stack.peek() == '/') {
                    answer.append(stack.pop());
                }
                stack.push(c);
            } else if (c == '/') {
                while (stack.peek() == '*' || stack.peek() == '/') {
                    answer.append(stack.pop());
                }
                stack.push(c);
            } else if (Character.isDigit(c)) {
                answer.append(c);
                while (i+1 < exp.length() && Character.isDigit(exp.charAt(i + 1))) {
                    answer.append(exp.charAt(++i));
                }
                answer.append('$');
            } else if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                while (stack.peek() != '(') {
                    answer.append(stack.pop());
                }
                stack.pop();
            }
        }

        while (!stack.empty()) {
            answer.append(stack.pop());
        }

        return answer.toString();
    }
}
