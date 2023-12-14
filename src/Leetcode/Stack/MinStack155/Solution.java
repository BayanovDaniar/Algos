package Leetcode.Stack.MinStack155;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class Solution{
    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(2147483646);
        minStack.push(2147483646);
        minStack.push(2147483647);
        minStack.top();
        minStack.pop();
        minStack.getMin();
        minStack.pop();
        minStack.getMin();
        minStack.pop();
        minStack.push(2147483647);
        minStack.top();
        minStack.getMin();
        minStack.push(-2147483648);
        minStack.top();
        minStack.getMin();
        minStack.pop();
        minStack.getMin();



//        minStack.push(-2);
//        minStack.push(0);
//        minStack.push(-3);
//        System.out.println(minStack.getMin());
//        minStack.pop();
//        System.out.println(minStack.top());
//        System.out.println(minStack.getMin());
    }
}
//
//class StackTemp {
//    private List<Integer> list;
//    private int N = 0;
//
//    public StackTemp() {
//        list = new ArrayList<>();
//    }
//
//    public void push(int val){
//        list.add(val);
//        N++;
//    }
//
//    public int pop(){
//        int val = list.get(--N);
//        list.remove(N);
//        return val;
//    }
//
//}


class MinStack {
    private final List<Integer> list;
    private int N = 0;
    private int minValue;
    private int minIndex;
    Stack<Integer> stack = new Stack<>();

    public MinStack() {
        list = new ArrayList<>();

        minValue = Integer.MAX_VALUE;
    }

    public void push(int val) {
        if(val <= minValue){
            minValue = val;
            minIndex = N;
            stack.push(N);
        }
        list.add(val);
        N++;
    }

    public void pop() {
        int temp = list.get(--N);
        if(temp == minValue){
            stack.pop();
            if(stack.empty()){
                minIndex = 0;
                minValue = Integer.MAX_VALUE;
            }else{
                minIndex = stack.peek();
                minValue = list.get(minIndex);
            }
        }
        list.remove(N);
    }

    public int top() {
        return list.get(N-1);
    }

    public int getMin() {
        return list.get(minIndex);
    }
}

