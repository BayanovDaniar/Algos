package Leetcode.BinarySearch.SnapshotArray1146;

public class Main {
    public static void main(String[] args) {
        SnapshotArray snapshotArray = new SnapshotArray(4);
        System.out.println(snapshotArray.snap());
        System.out.println(snapshotArray.snap());
        System.out.println(snapshotArray.get(3,1));
        snapshotArray.set(0,5);
        System.out.println(snapshotArray.snap());
        snapshotArray.set(0,6);
        System.out.println(snapshotArray.get(0,0));
    }
}

