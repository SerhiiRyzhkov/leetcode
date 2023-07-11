# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
It`s comfortable to use hashmap to control current depth of binary tree during traversal over the tree.
# Approach
<!-- Describe your approach to solving the problem. -->
We create stack container for traversal over the tree. Also, we create hashmap to write there nodes and their depths. We go through all the tree and check nodes that do not have any children and compare it to minimal value. At the end of walking over the tree we will get a minimal depth in the min var.

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
    public int minDepth(TreeNode root) {
        int min = Integer.MAX_VALUE;
        Stack<TreeNode>stack = new Stack<>();
        Map<TreeNode,Integer> map = new HashMap<>();
        if(root==null)return 0;
        stack.push(root);
        map.put(root,1);

        while (!stack.isEmpty()){
            TreeNode node = stack.pop();
            if(node.left!=null){
                map.put(node.left,map.get(node)+1);
                stack.push(node.left);
            }
            if(node.right!=null){
                map.put(node.right,map.get(node)+1);
                stack.push(node.right);
            }
            if((node.left==null)&&(node.right==null)&&(map.get(node)<min))min=map.get(node);
        }

        return min;
    }
}
```