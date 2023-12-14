package Leetcode.BinarySearch.SnapshotArray1146;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class SnapshotArray {
    public List<Integer>[] arr;
    public int snap_id;

    public SnapshotArray(int length) {
        arr = new ArrayList[length];
        snap_id = 0;
    }

    public void set(int index, int val) {
        if(arr[index] == null){
            arr[index] = new ArrayList<>();
        }
        if(snap_id >= arr[index].size()){
            int addNum = snap_id - arr[index].size();
            int num = (arr[index].size() == 0? 0 : arr[index].get(arr[index].size() - 1));
            for(int i = 0; i < addNum; i++){
                arr[index].add(num);
            }
            arr[index].add(val);
        }else{
            arr[index].set(snap_id, val);
        }

    }

    public int snap() {
        return snap_id++;
    }

    public int get(int index, int snap_id) {
        if(arr[index] != null && arr[index].size() > snap_id){
            return arr[index].get(snap_id);
        }
        if(arr[index] != null){
            return arr[index].get(arr[index].size() - 1);
        }
        return 0;

    }
}

/**
 * Your SnapshotArray object will be instantiated and called as such:
 * SnapshotArray obj = new SnapshotArray(length);
 * obj.set(index,val);
 * int param_2 = obj.snap();
 * int param_3 = obj.get(index,snap_id);

 */