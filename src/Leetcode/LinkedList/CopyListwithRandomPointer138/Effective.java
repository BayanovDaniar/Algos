package Leetcode.LinkedList.CopyListwithRandomPointer138;

import Leetcode.LinkedList.Node;

import java.util.HashMap;

public class Effective {
    public static void main(String[] args) {

    }

    public Node copyRandomList(Node head) {
        HashMap<Node, Node> map = new HashMap<>();
        Node cur = head;

        while (cur != null) {
            map.put(cur, new Node(cur.val));
            cur = cur.next;
        }

        cur = head;
        while (cur != null) {
            Node n = map.get(cur);
            n.next = map.get(cur.next);
            n.random = map.get(cur.random);
            cur = cur.next;
        }

        return map.get(head);
    }
}
