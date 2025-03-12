# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
We need to find all the leafs to calculate the path sums
# Approach
<!-- Describe your approach to solving the problem. -->
We create Map container and List container. In map container we are going to keep each node and their parents. In list container we are going to keep leafs. Then we travers over the tree and fill both containers. Now we know all leafs of the tree and know the parent of each node from the tree. We iterate over the list and check each leaf. Knowing its parent it is easy to calculate each path sum. If we find the targetSum we return true. Otherwise, return false.
# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
O(n)
- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```
class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null)return false;
        // Leaf, Parent
        Map<TreeNode,TreeNode> map = new HashMap<>();
        List<TreeNode>leafs = new ArrayList<>();
        Queue<TreeNode>queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            TreeNode node = queue.remove();

            if(node.left!=null){
                queue.add(node.left);
                map.put(node.left,node);
            }
            if(node.right!=null){
                queue.add(node.right);
                map.put(node.right,node);
            }
            if(node.right==null&&node.left==null)leafs.add(node);
            }

        for(TreeNode leaf:leafs)
        {
            int sum = root.val;
            while (leaf!=root){
                sum+=leaf.val;
                leaf=map.get(leaf);
            }
            if(sum==targetSum)return true;
        }

        return false;
    }
}
```