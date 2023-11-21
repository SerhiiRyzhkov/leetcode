package easy.Task_783;

import java.util.*;

// Minimum Distance Between BST Nodes
// https://leetcode.com/problems/minimum-distance-between-bst-nodes/
public class Solution {
    public int minDiffInBST(TreeNode root) {
        List<Integer>list = new LinkedList<>();

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            TreeNode node = queue.remove();
            list.add(node.val);
            Collections.sort(list);
            if(node.left!=null)queue.add(node.left);
            if(node.right!=null)queue.add(node.right);
        }

        int min = Integer.MAX_VALUE;
        Collections.sort(list);
        for(int i=1;i<list.size();i++)
            if(list.get(i)-list.get(i-1)<min)min=list.get(i)-list.get(i-1);

        return min;
    }
}