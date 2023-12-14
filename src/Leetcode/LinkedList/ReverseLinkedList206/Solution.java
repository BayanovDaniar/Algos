package Leetcode.LinkedList.ReverseLinkedList206;

import Leetcode.LinkedList.ListNode;

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(5, null);
        ListNode listNode1 = new ListNode(4, listNode);
        ListNode listNode2 = new ListNode(3 , listNode1);
        ListNode listNode3 = new ListNode(2, listNode2);
        ListNode listNode4 = new ListNode(1, listNode3);
        System.out.println(reverseList(listNode4));
    }

    public static ListNode reverseList(ListNode head) {
        if(head == null) return null;
        ArrayList<ListNode> list = new ArrayList<>();
        while (head != null) {
            ListNode listNode = new ListNode(head.val, head.next);
            list.add(listNode);
            head = listNode.next;
        }


        for (int i = list.size() - 1; i > 0; i--) {
            ListNode listNode = list.get(i);
            listNode.next = list.get(i - 1);
        }
        list.get(0).next = null;
        return list.get(list.size() - 1);
    }
}
