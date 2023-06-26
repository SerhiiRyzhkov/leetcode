# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
According to the fact that we have to check depth during binary tree traversal it`s convenient to keep current depth in hashmap container.
# Approach
<!-- Describe your approach to solving the problem. -->
We create hashmap container. We will write there information about every node and it`s depth. Then we, using queue, make traversal over the tree. When we reach depth above the input depth, we create a new Node. And create its children with definite nodes. When the queue is empty, it means that we have ended traversal and can return an updated tree. 
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
    public TreeNode addOneRow(TreeNode root, int val, int depth) {

        Map<TreeNode,Integer> map = new HashMap<>();
        Queue<TreeNode>queue = new LinkedList<>();
        if(depth==1) root = new TreeNode(val,root,null);

        queue.add(root);
        map.put(root,1);
        while (!queue.isEmpty()){
            TreeNode node = queue.remove();
            int dep=map.get(node);

            if(dep==depth-1){
                TreeNode leftChild = new TreeNode(val,node.left,null);
                TreeNode rightChild = new TreeNode(val,null,node.right);
                node.left=leftChild;
                node.right=rightChild;
            }

            if(node.left!=null) {
                queue.add(node.left);
                map.put(node.left,map.get(node)+1);
            }

            if(node.right!=null){
                queue.add(node.right);
                map.put(node.right,map.get(node)+1);
            }
        }


        return root;
    }
}
```