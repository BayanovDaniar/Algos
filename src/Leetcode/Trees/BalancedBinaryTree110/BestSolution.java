package Leetcode.Trees.BalancedBinaryTree110;

import Leetcode.Trees.TreeNode;
import javafx.util.Pair;

public class BestSolution {
    public boolean isBalanced(TreeNode root) {
        return supportive(root).getKey();
    }

    public Pair<Boolean, Integer> supportive(TreeNode root){
        if(root == null) return new Pair<>(true, 0);

        Pair<Boolean, Integer> left = supportive(root.left);
        Pair<Boolean, Integer> right = supportive(root.right);

        boolean result = left.getKey() && right.getKey() & Math.abs(left.getValue() - right.getValue()) <= 1;
        int depth = 1 + Math.max(left.getValue() , right.getValue());
        return new Pair<>(result, depth);
    }


}

