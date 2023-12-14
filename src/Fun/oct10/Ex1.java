package Fun.oct10;

import java.util.LinkedList;
import java.util.Queue;

public class Ex1 {
    public static void main(String[] args) {

        FixedCapacityStack stack = new FixedCapacityStack(5);
        System.out.println(stack.size());
        System.out.println(stack.isEmpty());
        stack.push("Hi");
        System.out.println(stack.size());
        System.out.println(stack.isEmpty());
        stack.push(" Daniar");
        System.out.println(stack.size());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.size());
    }
}
