package Leetcode.Trees.ValidateBinarySearchTree98;

import Leetcode.Trees.TreeNode;

public class Solution {

    public static void main(String[] args) {
        TreeNode treeNode1 = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode3 = new TreeNode(3);
        TreeNode treeNode4 = new TreeNode(4);
        TreeNode treeNode5 = new TreeNode(5);
        TreeNode treeNode6 = new TreeNode(6);
        TreeNode treeNode0 = new TreeNode(0);
        treeNode1.left= treeNode0;
        treeNode1.right = treeNode2;
        treeNode5.left = treeNode4;
        treeNode5.right = treeNode6;
        treeNode3.left = treeNode1;
        treeNode3.right = treeNode5;

        TreeNode treeNodecheck1 = new TreeNode(-2147483648);
        TreeNode treeNodecheck2 = new TreeNode(2147483647);
        treeNodecheck1.right = treeNodecheck2;


//        treeNode5.left = treeNode1;
//        treeNode5.right = treeNode4;
//        treeNode4.left = treeNode3;
//        treeNode4.right = treeNode6;
//        TreeNode treeNode = new TreeNode(2);
//        TreeNode treeNode1 = new TreeNode(1);
//        TreeNode treeNode2 = new TreeNode(3);
//        treeNode.left = treeNode1;
//        treeNode.right = treeNode2;


        Solution solution = new Solution();
        System.out.println(solution.isValidBST(treeNodecheck1));
    }

    public boolean isValidBST(TreeNode root) {
        if (root == null) return true;
        return dfs(root, null, null);
    }

    private boolean dfs(TreeNode root, Integer min, Integer max) {
        if (root == null) return true;

        if ((min != null && root.val <= min) || (max != null && root.val >= max)) {
            return false;
        }

        return dfs(root.left, min, root.val) && dfs(root.right, root.val, max);
    }



}
