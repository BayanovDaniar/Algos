package Leetcode.LinkedList.LRUCache146;

import java.util.HashMap;

public class LRUCache {
    public HashMap<Integer, Node> hashMap = new HashMap<>();
    public Node left = new Node(0);
    public Node right = new Node(0);
    public int cap;

    public LRUCache(int capacity) {
        cap = capacity;
        left.next = right;
        right.prev = left;
    }

    public int get(int key) {
        if (hashMap.containsKey(key)) {
            delete(hashMap.get(key));
            insert(hashMap.get(key));
            return hashMap.get(key).value;
        } else {
            return -1;
        }
    }

    public void put(int key, int value) {
        Node node = new Node(value);
        node.key = key;
        if (hashMap.containsKey(key)) {
            delete(hashMap.get(key));
        }
        insert(node);
        hashMap.put(key, node);

        if (hashMap.size() > cap) {
            hashMap.remove(left.next.key);
            delete(left.next);
        }
    }

    public void insert(Node node) {
        Node prev = right.prev;
        prev.next = node;
        right.prev = node;
        node.prev = prev;
        node.next = right;
    }

    public void delete(Node node) {
        Node prev = node.prev;
        Node nxt = node.next;
        prev.next = nxt;
        nxt.prev = prev;
    }

    static class Node {
        Node prev = null;
        Node next = null;
        int value;
        int key;

        public Node(int value) {
            this.value = value;
        }
    }
}
