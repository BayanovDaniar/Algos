package Leetcode.Trees.BalancedBinaryTree110;

import Leetcode.Trees.TreeNode;

public class Solution {


    public boolean isBalanced(TreeNode root) {
        if(root == null) return true;
        if(Math.abs(depth(root.left) - depth(root.right)) > 1){
            return false;
        }
        return isBalanced(root.left) && isBalanced(root.right);
    }

    public int depth(TreeNode root){
        if(root == null) return 0;
        return 1 + Math.max(depth(root.left), depth(root.right));
    }
}
