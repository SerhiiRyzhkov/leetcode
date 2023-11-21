# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
We need travers over the tree and get all the values.
# Approach
<!-- Describe your approach to solving the problem. -->
We create a container list. Then we travers over the tree and write every value to the container. Then we sort the container. And then we need to iterate over container and check every gap. And we need to find the minimal gap and return it.
# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
O(Nlogn)
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
    public int minDiffInBST(TreeNode root) {
                List<Integer>list = new LinkedList<>();

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            TreeNode node = queue.remove();
            list.add(node.val);
            if(node.left!=null)queue.add(node.left);
            if(node.right!=null)queue.add(node.right);
        }

        int min = Integer.MAX_VALUE;
        Collections.sort(list);    
        for(int i=1;i<list.size();i++)
            if(list.get(i)-list.get(i-1)<min)min=list.get(i)-list.get(i-1);

        return min;
    }
}
```