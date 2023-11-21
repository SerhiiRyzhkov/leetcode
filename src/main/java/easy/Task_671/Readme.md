# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
The easiest way to find solution is traversing over the tree and putting elements to a container.
# Approach
<!-- Describe your approach to solving the problem. -->
We travers over the tree and put every element to Set container, then we just return the second element if we got at least 2 different values from the tree.
# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
O(n)
- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```
import static java.lang.Integer.MAX_VALUE;
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
    public int findSecondMinimumValue(TreeNode root) {
        Queue<TreeNode>queue = new LinkedList<>();
        Set<Integer> set = new TreeSet<>();
        queue.add(root);
        while (!queue.isEmpty()){
            TreeNode node = queue.remove();
            set.add(node.val);
            if(node.left!=null){
                queue.add(node.right);
                queue.add(node.left);
            }
        }
        
                if(set.size()<2)return -1;
        else return set.stream().skip(1).findFirst().get();
    }
}
```