package Leetcode.Trees.InvertBinaryTree226;


import Leetcode.Trees.TreeNode;

class Solution {


    public TreeNode invertTree(TreeNode root) {
        if(root == null) return null;
        if(root.left != null)invertTree(root.left);
        if(root.right != null)invertTree(root.right);
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        return root;
    }
}