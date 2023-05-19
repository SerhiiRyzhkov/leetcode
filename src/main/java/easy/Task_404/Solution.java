package easy.Task_404;

import java.util.LinkedList;
import java.util.Queue;

//Sum of Left Leaves
//https://leetcode.com/problems/sum-of-left-leaves/
public class Solution {
    public int sumOfLeftLeaves(TreeNode root) {

        int result=0;

        Queue<TreeNode>queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty())
        {
            TreeNode node =queue.remove();
            if(node.left!=null){
                queue.add(node.left);
                if(isLeaf(node.left))result+=node.left.val;
            }
            if(node.right!=null)queue.add(node.right);
        }

        return result;
    }

    private boolean isLeaf(TreeNode node){
        return (node.left == null) && (node.right == null);
    }
}