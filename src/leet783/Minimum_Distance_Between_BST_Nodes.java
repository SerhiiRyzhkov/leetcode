package leet783;

import java.util.*;

public class Minimum_Distance_Between_BST_Nodes {
    public static void main(String[] args) {
    //TreeNode treeNode = new TreeNode(4, new TreeNode(2, new TreeNode(1), new TreeNode(3)), new TreeNode(6));
       // TreeNode treeNode = new TreeNode(27, null, new TreeNode(34,null,new TreeNode(58, new TreeNode(50, new TreeNode(44), null),null)));
        TreeNode treeNode = new TreeNode(90, new TreeNode(69, new TreeNode(49, null, new TreeNode(52)), new TreeNode(89)), null);

        System.out.println(minDiffInBST(treeNode));


    }
    public static int minDiffInBST(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<Integer>visited = new ArrayList<>();
        int min=0;

        queue.add(root);

        while (!queue.isEmpty()){
            TreeNode node = queue.remove();;
            visited.add(node.val);
            System.out.println(node);
            if(node.right!=null)queue.add(node.right);
            if(node.left!=null)queue.add(node.left);
}
        Collections.sort(visited);

        min=Math.abs(visited.get(1)-visited.get(0));

        for(int i=2;i<visited.size();i++)
        {
            int raznica = Math.abs(visited.get(i)-visited.get(i-1));
            if(raznica<min)min=raznica;
        }
        return min;
    }
}


class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }

    @Override
    public String toString() {
        return "TreeNode{" +
                "val=" + val +
                '}';
    }
}