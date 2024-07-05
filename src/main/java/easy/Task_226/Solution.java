package easy.Task_226;

import java.util.*;

// Invert Binary Tree
// https://leetcode.com/problems/invert-binary-tree/description/
public class Solution {
    public TreeNode invertTree(TreeNode root) {

        if (root == null) return null;
        Queue<TreeNode> queue = new LinkedList<>();


        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.remove();
            TreeNode temp;
            if (node.left != null) {
                temp = node.left;
                node.left = node.right;
                node.right = temp;
            } else if (node.right != null) {
                temp = node.right;
                node.right = node.left;
                node.left = temp;
            }
            if (node.left != null) queue.add(node.left);
            if (node.right != null) queue.add(node.right);
        }

        return root;
    }
}