package Leetcode.LinkedList.AddTwoNumbers2;

import Leetcode.LinkedList.ListNode;

public class Solution {
    public static void main(String[] args) {
        ListNode listNode2 = new ListNode(9, null);
        ListNode listNode1 = new ListNode(4, listNode2);
        ListNode listNode0 = new ListNode(2, listNode1);

        ListNode node2 = new ListNode(9, null);
        ListNode node1 = new ListNode(4, node2);
        ListNode node0 = new ListNode(6, node1);
        ListNode node01 = new ListNode(5, node0);

        System.out.println(addTwoNumbers(listNode0, node01));
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode();
        ListNode head = result;
        int additional = 0;
        while(l1 != null || l2 != null){
            int val1 = l1 == null ? 0 : l1.val;
            int val2 = l2 == null ? 0 : l2.val;
            l1 = l1 == null ? null : l1.next;
            l2 = l2 == null ? null : l2.next;
            int sum = val1 + val2 + additional;
            additional = sum / 10;
            head.next = new ListNode(sum % 10);
            head = head.next;
        }
        if(additional != 0) {
            head.next = new ListNode(additional);
            head = head.next;
        }
        head.next = null;
        return result.next;
    }

}
