package Leetcode.Trees.SubtreeofAnotherTree572;

import Leetcode.Trees.TreeNode;

public class Solution {

    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root == null)return false;
        if(root.val == subRoot.val){
            if(isSame(root,subRoot)){
                return true;
            }
        }
        return (isSubtree(root.left,subRoot) || isSubtree(root.right, subRoot));
    }


    public boolean isSame(TreeNode p, TreeNode q){
        if(p == null && q == null) return true;
        if(p == null || q == null) return false;
        if(p.val != q.val) return false;
        return isSame(p.left, q.left) && isSame(p.right, q.right);
    }
}
