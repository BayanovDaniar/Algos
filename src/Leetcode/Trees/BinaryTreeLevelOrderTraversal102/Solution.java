package Leetcode.Trees.BinaryTreeLevelOrderTraversal102;

import Leetcode.Trees.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    List<List<Integer>> lists = new ArrayList<>();
    int level = 0;

    public List<List<Integer>> levelOrder(TreeNode root) {
        int maxLevel = maxDepth(root);
        for(int i = 0; i < maxLevel; i++){
            lists.add(new ArrayList<>());
        }
        traverse(root);
        return lists;
    }

    public int maxDepth(TreeNode node){
        if(node == null) return 0;
        return 1 + Math.max(maxDepth(node.left), maxDepth(node.right));
    }

    public void traverse(TreeNode root){
        level++;
        if(root == null){
            level--;
            return;
        }
        lists.get(level-1).add(root.val);
        traverse(root.left);
        traverse(root.right);
        level--;
    }

}
