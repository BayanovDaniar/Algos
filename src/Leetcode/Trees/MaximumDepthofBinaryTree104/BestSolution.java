package Leetcode.Trees.MaximumDepthofBinaryTree104;

import Leetcode.Trees.TreeNode;

public class BestSolution {
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }
}
