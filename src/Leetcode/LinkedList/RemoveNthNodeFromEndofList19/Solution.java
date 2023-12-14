package Leetcode.LinkedList.RemoveNthNodeFromEndofList19;

import Leetcode.LinkedList.ListNode;

public class Solution {
    public static void main(String[] args) {
//        ListNode listNode0 = new ListNode(5, null);
//        ListNode listNode1 = new ListNode(4, listNode0);
//        ListNode listNode2 = new ListNode(3 , listNode1);
//        ListNode listNode3 = new ListNode(2, listNode2);
//        ListNode listNode4 = new ListNode(1, listNode3);
//        ListNode listNode = removeNthFromEnd(listNode4,2);

        ListNode node0 = new ListNode(2, null);
        ListNode node = new ListNode(1, node0);
        ListNode listNode = removeNthFromEnd(node,2);
        System.out.println(listNode);
    }


    public static ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next == null) return null;
        ListNode pointer1 = head;
        ListNode pointer2 = head;

        int i = 1   ;
        while(pointer2.next != null){
            if (i > n) {
                pointer1 = pointer1.next;
            }
            i++;
            pointer2 = pointer2.next;
        }

        if (i > n) pointer1.next = pointer1.next.next;
        else head = head.next;
        return head;
    }
}
