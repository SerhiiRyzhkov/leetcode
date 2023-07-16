# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
We should walk over both trees using Stack.
# Approach
<!-- Describe your approach to solving the problem. -->
We create two List containers leafs1 and leafs2 where we are going to keep leafs of both trees. To walk over both trees we use Stack to achieve preorder traversal. After the walking all we have to do is compare two Lists and return the result.
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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {


        List<Integer> leafs1 = new LinkedList<>();
        List<Integer> leafs2 = new LinkedList<>();

        Stack<TreeNode> stack1 = new Stack<>();
        Stack<TreeNode> stack2 = new Stack<>();
        stack1.add(root1);
        stack2.add(root2);

        while ((!stack1.isEmpty())||(!stack2.isEmpty())){
            if(!stack1.isEmpty()) {
                TreeNode node1 = stack1.pop();
                if ((node1.left == null) && (node1.right == null)) leafs1.add(node1.val);
                if (node1.left != null) stack1.add(node1.left);
                if (node1.right != null) stack1.add(node1.right);
            }
            if(!stack2.isEmpty()) {
                TreeNode node2 = stack2.pop();
                if ((node2.left == null) && (node2.right == null)) leafs2.add(node2.val);
                if (node2.left != null) stack2.add(node2.left);
                if (node2.right != null) stack2.add(node2.right);
            }
        }

        return leafs1.equals(leafs2);
    }
}
```