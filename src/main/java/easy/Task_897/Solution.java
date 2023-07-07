package easy.Task_897;

import java.util.*;

// Increasing Order Search Tree
// https://leetcode.com/problems/increasing-order-search-tree/
public class Solution {
    public TreeNode increasingBST(TreeNode root) {

        TreeNode result = new TreeNode();
        List<Integer> nodes = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            TreeNode node = queue.remove();
            nodes.add(node.val);
            if(node.left!=null)queue.add(node.left);
            if(node.right!=null)queue.add(node.right);
        }
        Collections.sort(nodes);

        TreeNode temp = result;

        temp.val=nodes.get(0);
        for(int i=0;i<nodes.size()-1;i++)
        {
            temp.right=new TreeNode(nodes.get(i+1));
            temp=temp.right;
        }

        return result;
    }
}