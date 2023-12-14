package Leetcode.LinkedList.CopyListwithRandomPointer138;

import Leetcode.LinkedList.Node;

public class Solution {
    public static void main(String[] args) {
        Node node4 = new Node(1, null, null);
        Node node3 = new Node(10, node4, null);
        Node node2 = new Node(11, node3, null);
        Node node1 = new Node(13, node2, null);
        Node node0 = new Node(7, node1, null);
        node4.random = node0;
        node3.random = node2;
        node2.random = node4;
        node1.random = node0;
        node0.random = null;
        System.out.println(copyRandomList(node0));
    }

    public static Node copyRandomList(Node head) {
        if (head == null) return null;
        Node resultNode = new Node(0, null, null);
        Node temp = head;
        Node iter = resultNode;
        while (temp != null) {
            iter.next = new Node(temp.val, null, null);
            iter = iter.next;
            temp = temp.next;
        }

        resultNode = resultNode.next; // Указатель на начало списка
        temp = resultNode; // Шагает по result списку
        Node headStep = head; // Шагает по изначальному списку
        while (temp != null) {
            Node headIter = head; // Итератор по изначальному списку
            Node random = headStep.random;
            iter = resultNode;
            while (headIter != random) {
                iter = iter.next;
                headIter = headIter.next;
            }
            temp.random = iter;
            temp = temp.next;
            headStep = headStep.next;
        }

        return resultNode;
    }
}
