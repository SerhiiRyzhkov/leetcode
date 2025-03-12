package easy.Task_112;


import java.util.*;

// Path Sum
// https://leetcode.com/problems/path-sum/
public class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null)return false;
        // Leaf, Parent
        Map<TreeNode,TreeNode> map = new HashMap<>();
        List<TreeNode>leafs = new ArrayList<>();
        Queue<TreeNode>queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            TreeNode node = queue.remove();

            if(node.left!=null){
                queue.add(node.left);
                map.put(node.left,node);
            }
            if(node.right!=null){
                queue.add(node.right);
                map.put(node.right,node);
            }
            if(node.right==null&&node.left==null)leafs.add(node);
            }

        for(TreeNode leaf:leafs)
        {
            int sum = root.val;
            while (leaf!=root){
                sum+=leaf.val;
                leaf=map.get(leaf);
            }
            if(sum==targetSum)return true;
        }

        return false;
    }
}