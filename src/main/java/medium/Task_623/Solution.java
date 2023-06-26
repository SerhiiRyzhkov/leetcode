package medium.Task_623;


import java.util.*;

// Add One Row to Tree
// https://leetcode.com/problems/add-one-row-to-tree/
public class Solution {
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        Map<TreeNode,Integer> map = new HashMap<>();
        Queue<TreeNode>queue = new LinkedList<>();

        if(depth==1) root = new TreeNode(val,root,null);

        queue.add(root);
        map.put(root,1);
        while (!queue.isEmpty()){
            TreeNode node = queue.remove();
            int dep=map.get(node);

            if(dep==depth-1){
                TreeNode leftChild = new TreeNode(val,node.left,null);
                TreeNode rightChild = new TreeNode(val,null,node.right);
                node.left=leftChild;
                node.right=rightChild;
            }

            if(node.left!=null) {
                queue.add(node.left);
                map.put(node.left,map.get(node)+1);
            }

            if(node.right!=null){
                queue.add(node.right);
                map.put(node.right,map.get(node)+1);
            }
        }


        return root;
    }
}