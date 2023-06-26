# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
Probably, level order traversal will help us find solution.
# Approach
<!-- Describe your approach to solving the problem. -->
We do level order traversal and using hashmap container also write down the level of all elements of the tree. During traveling over the tree we check if the input nodes have the same parent. After filling up the hashmap we check if the input nodes have the same level.
# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
O(n)
- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
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
```