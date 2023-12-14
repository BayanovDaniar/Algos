package Leetcode.Trees.CountGoodNodesinBinaryTree1448;

import Leetcode.Trees.TreeNode;

public class Solution {

    static int counter = 0;


    public int goodNodes(TreeNode root) {
        return traverseMax(root, Integer.MIN_VALUE);
    }

    public int traverseMax(TreeNode root, int maxVal){
        int i = 0;
        if(root == null) return i;
        if(root.val >= maxVal){
            i = 1;
            maxVal = root.val;
        }
        return i + traverseMax(root.left, maxVal) + traverseMax(root.right, maxVal);
    }
}
