package Leetcode.Trees.LowestCommonAncestorofaBinarySearchTree235;

import Leetcode.Trees.TreeNode;

public class Solution {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(findNode(root.left, p) && findNode(root.left, q)) return lowestCommonAncestor(root.left, p, q);
        if(findNode(root.right,p) && findNode(root.right,q)) return lowestCommonAncestor(root.right,p, q);
        return root;
    }

    public boolean findNode(TreeNode root, TreeNode val){
        if(root == null) return false;
        if(root == val)return true;
        return findNode(root.left, val) || findNode(root.right, val);
    }

}
