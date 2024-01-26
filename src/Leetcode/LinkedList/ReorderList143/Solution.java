package Leetcode.LinkedList.ReorderList143;

import Leetcode.LinkedList.ListNode;

public class Solution {
    public static void main(String[] args) {
//        ListNode listNode = new ListNode(5, null);
        ListNode listNode1 = new ListNode(4, null);
        ListNode listNode2 = new ListNode(3 , listNode1);
        ListNode listNode3 = new ListNode(2, listNode2);
        ListNode listNode4 = new ListNode(1, listNode3);
        reorderList(listNode4);
        System.out.println(listNode4);
    }

    public static void reorderList(ListNode head) {
        int length = 0;
        ListNode temp = head;
        while (head != null){
            head = head.next;
            length++;
        }
        head = temp;
        ListNode middle = new ListNode();
        for(int i = 0; i < (length+1) / 2; i++){
            if(i == ((length+1) / 2) - 1){
                head.next = reverseList(head.next);
                middle = head.next;
            }else {
                head = head.next;
            }
        }
        head = temp;

        ListNode result = new ListNode();
        for(int i = 0; i < (length+1) / 2; i++){
            result.next = head;
            head = head.next;
            if(middle != null){
                result.next.next = middle;
                middle = middle.next;
            }
            result = result.next.next;
        }

        for(int i = 0; i < length - 1; i++){
            temp = temp.next;
        }
        temp.next = null;

    }

    public static ListNode reverseList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }

        ListNode node = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return node;
    }


}
