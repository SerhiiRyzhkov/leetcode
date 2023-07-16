# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
It is elementary binary tree problem. We just need walk over the tree util we found a value unequal to root value.
# Approach
<!-- Describe your approach to solving the problem. -->
We use Queue to walk over the tree. We compare every node`s val if its val is equal to root val. If we found different val we return false, otherwise we are able to walk through and return true after walking.
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
    public boolean isUnivalTree(TreeNode root) {
        int value = root.val;

        Queue<TreeNode>queue=new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            TreeNode node = queue.remove();
            if(node.val!=value)return false;
            if(node.left!=null)queue.add(node.left);
            if(node.right!=null)queue.add(node.right);
        }


        return true;
    }
}
```