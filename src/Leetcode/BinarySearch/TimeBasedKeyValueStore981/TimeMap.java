package Leetcode.BinarySearch.TimeBasedKeyValueStore981;

import javafx.util.Pair;

import java.util.ArrayList;
import java.util.HashMap;

class TimeMap {
    HashMap<String, ArrayList<Pair<Integer,String>>> map = new HashMap<>();

    public TimeMap() {
    }

    public void set(String key, String value, int timestamp) {
        ArrayList<Pair<Integer,String>> list= map.getOrDefault(key, new ArrayList<>());
        list.add(new Pair<>(timestamp, value));
        map.put(key, list);
    }

    public String get(String key, int timestamp) {
        ArrayList<Pair<Integer,String>> list = map.get(key);
        if(list == null) return "";
        return binarySearch(list,timestamp);
    }

    private String binarySearch(ArrayList<Pair<Integer,String>> list, int timestamp){
        if(list.get(0).getKey() > timestamp) return "";
        int l = 0, r = list.size() - 1, mid;

        while(l < r){
            mid = (l + r + 1) / 2;
            if(list.get(mid).getKey() <= timestamp){
                l = mid;
            }else{
                r = mid - 1;
            }
        }

        return list.get(l).getValue();
    }
}
