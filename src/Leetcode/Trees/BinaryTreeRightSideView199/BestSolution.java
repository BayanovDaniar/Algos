package Leetcode.Trees.BinaryTreeRightSideView199;

import Leetcode.Trees.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BestSolution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        dfs(root, res, 1);
        return res;
    }

    private void dfs(TreeNode node, List<Integer> res, int depth) {
        if (node == null) {
            return;
        }
        if (depth > res.size()) {
            res.add(node.val);
        }
        dfs(node.right, res, depth + 1);
        dfs(node.left, res, depth + 1);
    }
}

