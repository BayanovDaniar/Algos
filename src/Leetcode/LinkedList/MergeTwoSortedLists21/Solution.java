package Leetcode.LinkedList.MergeTwoSortedLists21;

import Leetcode.LinkedList.ListNode;

public class Solution {

    public static void main(String[] args) {
        ListNode listNode = new ListNode(4, null);
        ListNode listNode1 = new ListNode(2, listNode);
        ListNode listNode2 = new ListNode(1 , listNode1);


        ListNode listNode3 = new ListNode(4, null);
        ListNode listNode4 = new ListNode(3, listNode3);
        ListNode listNode5 = new ListNode(1, listNode4);

        mergeTwoLists(listNode2, listNode5);
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode cur = new ListNode();
        ListNode result = cur;
        while(list1 != null && list2 != null){
            if(list1.val <= list2.val){
                cur.next = new ListNode(list1.val);
                cur = cur.next;
                list1 = list1.next;
            }else{
                cur.next = new ListNode(list2.val);
                cur = cur.next;
                list2 = list2.next;
            }
        }
        cur.next = list1 == null ? list2 : list1;
        return result.next;
    }
}
