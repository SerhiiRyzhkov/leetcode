package easy.Task_111;


import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

// Minimum Depth of Binary Tree
// https://leetcode.com/problems/minimum-depth-of-binary-tree/
public class Solution {
    public int minDepth(TreeNode root) {
        int min = Integer.MAX_VALUE;
        Stack<TreeNode>stack = new Stack<>();
        Map<TreeNode,Integer> map = new HashMap<>();
        if(root==null)return 0;
        stack.push(root);
        map.put(root,1);

        while (!stack.isEmpty()){
            TreeNode node = stack.pop();
            if(node.left!=null){
                map.put(node.left,map.get(node)+1);
                stack.push(node.left);
            }
            if(node.right!=null){
                map.put(node.right,map.get(node)+1);
                stack.push(node.right);
            }
            if((node.left==null)&&(node.right==null)&&(map.get(node)<min))min=map.get(node);
        }

        return min;
    }
}