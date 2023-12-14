package Leetcode.Stack.CarFleet853;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.carFleet(10, new int[]{6,8}, new int[]{3,2}));
    }
    public int carFleet(int target, int[] position, int[] speed) {

        TreeMap<Integer,Integer> treeMap1 = new TreeMap<>();

        for(int i = 0; i < position.length; i++){
            treeMap1.put(position[i],speed[i]);
        }

        NavigableMap<Integer,Integer> treeMap =treeMap1.descendingMap();

        Stack<Map.Entry<Integer,Integer>> stack = new Stack<>();

        for(Map.Entry<Integer, Integer> set : treeMap.entrySet()){
            if(stack.empty()) stack.push(set);
            Map.Entry<Integer,Integer> set1 = stack.peek();
            double time = ((double)(target - set.getKey()))/(double) set.getValue();
            double time1 = ((double)(target - set1.getKey()))/(double) set1.getValue();
            if(time == time1){
                stack.pop();
                stack.push(set);
            }else if(time > time1){
                stack.push(set);
            }
        }

        return stack.size();
    }


}
