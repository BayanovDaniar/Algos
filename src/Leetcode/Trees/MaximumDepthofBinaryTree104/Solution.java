package Leetcode.Trees.MaximumDepthofBinaryTree104;

import Leetcode.Trees.TreeNode;

public class Solution {

    public static int deepCount = 0;
    public static int localCount = 0;

    public int maxDepth(TreeNode root) {
        deepCount = 0;
        localCount = 0;
        deepTraversal(root);
        return deepCount;
    }

    public static TreeNode deepTraversal(TreeNode treeNode){
        localCount++;
        if(treeNode == null) {
            localCount--;
            return null;
        }
        if(deepTraversal(treeNode.left) != null) localCount--;
        if(deepTraversal(treeNode.right) != null) localCount--;
        deepCount = Math.max(deepCount, localCount);
        return treeNode;
    }
}
