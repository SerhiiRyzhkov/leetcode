package medium.Task_863;

import java.util.*;

// All Nodes Distance K in Binary Tree
// https://leetcode.com/problems/all-nodes-distance-k-in-binary-tree/
public class Solution {
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {

        Map<Integer, List<Integer>> map = new HashMap<>();


        Queue<TreeNode>queue = new LinkedList<>();

        queue.add(root);

        while (!queue.isEmpty())
        {
            TreeNode node = queue.remove();

            if(!map.containsKey(node.val))map.put(node.val,new ArrayList<>());

            if(node.left!=null){
                queue.add(node.left);
                map.get(node.val).add(node.left.val);
                    if(!map.containsKey(node.left.val))map.put(node.left.val, new ArrayList<>());
                    map.get(node.left.val).add(node.val);
            }


            if(node.right!=null){
                queue.add(node.right);
                map.get(node.val).add(node.right.val);
                    if(!map.containsKey(node.right.val))map.put(node.right.val, new ArrayList<>());
                    map.get(node.right.val).add(node.val);
            }
        }

        Map<Integer, List<Integer>> levels = new HashMap<>();

        List<Integer> previousLevels = new ArrayList<>();

        int level=0;
        levels.put(level,new ArrayList<>(List.of(target.val)));

        while (level<k){
            levels.put(level+1, new ArrayList<>());

            for(int i=0;i<levels.get(level).size();i++)
                levels.get(level+1).
                        addAll(map.get(levels.get(level).get(i)));

            previousLevels.addAll(levels.get(level));

            level++;
            levels.get(level).removeAll(levels.get(level-1));

            levels.put(level,
            levels.get(level).stream().distinct().filter(el->el!=target.val).toList());
        }


        List<Integer>result = new ArrayList<>(levels.get(k));

        result.removeAll(previousLevels);

        return result;
    }
}