package medium.Task_623;

import java.util.*;

public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      public TreeNode() {}
      public TreeNode(int val) { this.val = val; }
      public TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }

    @Override
    public boolean equals(Object o) {
        List<Integer> tree1 = new ArrayList<>();
        List<Integer> tree2 = new ArrayList<>();

        Queue<TreeNode>queue1= new LinkedList<>();
        queue1.add(this);
        while (!queue1.isEmpty())
        {
            TreeNode node = queue1.remove();
            tree1.add(node.val);
            if(node.left!=null)queue1.add(node.left);
            if(node.right!=null)queue1.add(node.right);
        }


        Queue<TreeNode>queue2= new LinkedList<>();
        queue2.add((TreeNode) o);
        while (!queue2.isEmpty())
        {
            TreeNode node = queue2.remove();
            tree2.add(node.val);
            if(node.left!=null)queue2.add(node.left);
            if(node.right!=null)queue2.add(node.right);
        }

        return tree1.equals(tree2);
      }

}