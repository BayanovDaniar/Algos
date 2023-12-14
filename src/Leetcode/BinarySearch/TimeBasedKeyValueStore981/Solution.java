package Leetcode.BinarySearch.TimeBasedKeyValueStore981;

public class Solution {
    public static void main(String[] args) {
        TimeMap timeMap = new TimeMap();
        timeMap.set("a", "bar" , 1);
        timeMap.set("x", "b" , 3);
        System.out.println(timeMap.get("b", 3));
        timeMap.set("foo", "bar2" , 4);
        System.out.println(timeMap.get("foo", 4));
        System.out.println(timeMap.get("foo", 5));

    }
}

