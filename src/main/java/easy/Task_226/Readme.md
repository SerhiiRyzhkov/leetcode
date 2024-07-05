# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
We do not need to create a new tree. We just need to iterate over tree and change left and right nodes of every node. Also, we have to be careful with null leafs. 
# Approach
<!-- Describe your approach to solving the problem. -->
We check if we have null tree. This cas we need to consider separately. Then we create a queue and using the queue we travers over the tree. On each node we check if we have null leaf. Then we just swap  the leafs and add them to the queue. We do it until the queue is empty.
# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
O(n)
- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```
class Solution {
    public TreeNode invertTree(TreeNode root) {

        if (root == null) return null;
        Queue<TreeNode> queue = new LinkedList<>();


        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.remove();
            TreeNode temp;
            if (node.left != null) {
                temp = node.left;
                node.left = node.right;
                node.right = temp;
            } else if (node.right != null) {
                temp = node.right;
                node.right = node.left;
                node.left = temp;
            }
            if (node.left != null) queue.add(node.left);
            if (node.right != null) queue.add(node.right);
        }

        return root;
    }
}
```