package easy.Task_530;


import java.util.*;

// Minimum Absolute Difference in BST
// https://leetcode.com/problems/minimum-absolute-difference-in-bst/
public class Solution {
    public int getMinimumDifference(TreeNode root) {
        List<Integer> list = new LinkedList<>();
        int result = Integer.MAX_VALUE;
        Queue<TreeNode>queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty())
        {
            TreeNode node = queue.remove();
            list.add(node.val);
            if(node.left!=null)queue.add(node.left);
            if(node.right!=null)queue.add(node.right);
        }

        Collections.sort(list);
        for(int i=1;i<list.size();i++)
            result=Math.min(result,list.get(i)-list.get(i-1));

        return result;
    }
}