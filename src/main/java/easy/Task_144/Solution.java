package easy.Task_144;

import java.util.*;

//Binary Tree Preorder Traversal
//https://leetcode.com/problems/binary-tree-preorder-traversal/
public class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer>list = new ArrayList<>();

        Stack<TreeNode> stack = new Stack<>();
        if(root!=null)stack.add(root);
        while (!stack.isEmpty())
        {
            TreeNode node = stack.pop();
            list.add(node.val);

            if(node.right!=null)stack.add(node.right);
            if(node.left!=null)stack.add(node.left);
        }

        return list;
    }
}