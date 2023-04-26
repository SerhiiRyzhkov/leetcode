# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
I might use Queue or Stack to walk all over the tree.
# Approach
<!-- Describe your approach to solving the problem. -->
I use Queue to walk all over the tree. Also, I created a method isLeaf(). That method check if node has left or right node or not. During walking all over the tree I check if current node is leaf and if is, I add its value to result.
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

    public boolean isLeaf(TreeNode node){
        return (node.left == null) && (node.right == null);
    }
}
```