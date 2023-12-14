package Leetcode.LinkedList.ReverseNodesinkGroup25;

import Leetcode.LinkedList.ListNode;

import java.util.List;

public class Solution {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(5, null);
        ListNode listNode1 = new ListNode(4, listNode);
        ListNode listNode2 = new ListNode(3, listNode1);
        ListNode listNode3 = new ListNode(2, listNode2);
        ListNode listNode4 = new ListNode(1, listNode3);
        System.out.println(reverseKGroup(listNode4, 2));

    }

    public static ListNode reverseKGroup(ListNode head, int k) {
        boolean flag = true;
        ListNode result = null;
        ListNode next = head;
        while (next != null) {
            ListNode leftP = next;
            ListNode rightP = next;
            for (int i = 0; i < k - 1 && rightP != null; i++) {
                rightP = rightP.next;
            }
            if (rightP == null) break;
            next = rightP.next;

            if (flag) {
                result = reverse(leftP, next);
                flag = false;
            } else {
                head.next = reverse(leftP, next);
                head = leftP;
            }
        }
        return result;
    }

    public static ListNode reverse(ListNode head, ListNode next) {
        if (head == next || head.next == next) return head;

        ListNode res = reverse(head.next, next);
        head.next.next = head;
        head.next = next;
        return res;
    }

}
