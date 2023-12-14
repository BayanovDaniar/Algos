package Leetcode.Trees.DiameterofBinaryTree543;

import Leetcode.Trees.TreeNode;

public class Solution {

    public static int localMax = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        localMax = 0;
        diameter(root);
        return localMax;
    }

    public int diameter(TreeNode root) {
        if (root == null) return 0;
        int left = diameter(root.left);
        int right = diameter(root.right);
        localMax = Math.max(localMax,  left + right);
        return  1 + Math.max( left, right);
    }


}
