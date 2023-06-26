# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
Regarding the fact we need to write down numbers in preorder traversal we will need to use stack container.
# Approach
<!-- Describe your approach to solving the problem. -->
We use classical way to commit preorder traversal. We write all the nodes to stack and pop them. In this way we will receive nodes in traversal preorder.
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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer>list = new ArrayList<>();

        Stack<TreeNode> stack = new Stack<>();
        if(root!=null)stack.add(root);
        while (!stack.isEmpty())
        {
            TreeNode node = stack.pop();
            list.add(node.val);
            
            if(node.right!=null)stack.add(node.right);
            if(node.left!=null)stack.add(node.left);
        }

        return list;
    }
}
```