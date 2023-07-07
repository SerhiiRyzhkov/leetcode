# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
It will be easy to use List to write there all the vals from treenode.
# Approach
<!-- Describe your approach to solving the problem. -->
We create List, and write there all the vals from the input tree. Then we sort the list. And, using loop and temp var we create a result tree, where we write down all the elements from the list to the result tree.
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
    public TreeNode increasingBST(TreeNode root) {

        TreeNode result = new TreeNode();
        List<Integer> nodes = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            TreeNode node = queue.remove();
            nodes.add(node.val);
            if(node.left!=null)queue.add(node.left);
            if(node.right!=null)queue.add(node.right);
        }
        Collections.sort(nodes);

        TreeNode temp = result;

        temp.val=nodes.get(0);
        for(int i=0;i<nodes.size()-1;i++)
        {
            temp.right=new TreeNode(nodes.get(i+1));
            temp=temp.right;
        }

        return result;
    }
}
```