package easy.Task_993;

import java.util.*;

//  Cousins in Binary Tree
//  https://leetcode.com/problems/cousins-in-binary-tree/
public class Solution {
    public boolean isCousins(TreeNode root, int x, int y) {
        Map<Integer, Integer> map = new HashMap<>();
        int depth = 0;
        Queue<TreeNode>queue = new LinkedList<>();
        queue.add(root);
        map.put(root.val,depth);
        while (!queue.isEmpty()){
            TreeNode node = queue.remove();
            if(((node.left!=null)&&(node.right!=null))&&
                    ((node.left.val==x)&&(node.right.val==y)||(node.left.val==y)&&(node.right.val==x)))
                return false;

            if(node.left!=null)
            {queue.add(node.left);map.put(node.left.val,map.get(node.val)+1);}
            if(node.right!=null)
            {queue.add(node.right);map.put(node.right.val,map.get(node.val)+1);}
        }
        return map.get(x)==map.get(y);
    }
}