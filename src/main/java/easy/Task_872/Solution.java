package easy.Task_872;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;


// Leaf-Similar Trees
// https://leetcode.com/problems/leaf-similar-trees/
public class Solution {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {


        List<Integer> leafs1 = new LinkedList<>();
        List<Integer> leafs2 = new LinkedList<>();

        Stack<TreeNode> stack1 = new Stack<>();
        Stack<TreeNode> stack2 = new Stack<>();
        stack1.add(root1);
        stack2.add(root2);

        while ((!stack1.isEmpty())||(!stack2.isEmpty())){
            if(!stack1.isEmpty()) {
                TreeNode node1 = stack1.pop();
                if ((node1.left == null) && (node1.right == null)) leafs1.add(node1.val);
                if (node1.left != null) stack1.add(node1.left);
                if (node1.right != null) stack1.add(node1.right);
            }
            if(!stack2.isEmpty()) {
                TreeNode node2 = stack2.pop();
                if ((node2.left == null) && (node2.right == null)) leafs2.add(node2.val);
                if (node2.left != null) stack2.add(node2.left);
                if (node2.right != null) stack2.add(node2.right);
            }
        }

        return leafs1.equals(leafs2);
    }
}