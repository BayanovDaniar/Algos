package Leetcode.LinkedList.MergekSortedLists23;

import Leetcode.LinkedList.ListNode;

import java.util.ArrayList;
import java.util.Arrays;


public class Solution {

    public ListNode mergeKLists(ListNode[] lists) {
        if(lists == null || lists.length == 0){
            return null;
        }

        ArrayList<ListNode> nodes = new ArrayList<>(Arrays.asList(lists));

        while(nodes.size() > 1){
            ArrayList<ListNode> temp = new ArrayList<>();
            for(int i = 0; i < nodes.size(); i+=2){
                ListNode node1 = nodes.get(i);
                ListNode node2 = i+1 >= nodes.size() ? null : nodes.get(i+1);
                temp.add(merge(node1,node2));
            }
            nodes = temp;
        }
        return nodes.get(0);
    }

    public static ListNode merge(ListNode node1, ListNode node2){
        ListNode resultNode = new ListNode();
        ListNode head = resultNode;
        while(node1 != null && node2 != null){
            if(node1.val <= node2.val){
                resultNode.next = new ListNode(node1.val);
                node1 = node1.next;
            }else{
                resultNode.next = new ListNode(node2.val);
                node2 = node2.next;
            }
            resultNode = resultNode.next;
        }
        resultNode.next = node1 != null ? node1 : node2;

        return head.next;
    }
}
