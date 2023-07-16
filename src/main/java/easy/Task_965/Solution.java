package easy.Task_965;

import java.util.LinkedList;
import java.util.Queue;

// Univalued Binary Tree
// https://leetcode.com/problems/univalued-binary-tree/
public class Solution {
    public boolean isUnivalTree(TreeNode root) {
        int value = root.val;

        Queue<TreeNode>queue=new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            TreeNode node = queue.remove();
            if(node.val!=value)return false;
            if(node.left!=null)queue.add(node.left);
            if(node.right!=null)queue.add(node.right);
        }


        return true;
    }
}