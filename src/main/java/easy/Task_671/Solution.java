package easy.Task_671;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;


// Second Minimum Node In a Binary Tree
// https://leetcode.com/problems/second-minimum-node-in-a-binary-tree/
public class Solution {
    public int findSecondMinimumValue(TreeNode root) {
        Queue<TreeNode>queue = new LinkedList<>();
        Set<Integer> set = new TreeSet<>();
        queue.add(root);
        while (!queue.isEmpty()){
            TreeNode node = queue.remove();
            set.add(node.val);
            if(node.left!=null){
                queue.add(node.right);
                queue.add(node.left);
            }
        }

        if(set.size()<2)return -1;
        else return set.stream().skip(1).findFirst().get();
    }
}