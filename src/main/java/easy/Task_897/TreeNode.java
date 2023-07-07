package easy.Task_897;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

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
      public boolean equals(Object obj) {
          Queue<TreeNode>queue1 = new LinkedList<>();
          Queue<TreeNode>queue2 = new LinkedList<>();

          queue1.add(this);
          queue2.add((TreeNode)(obj));

          while ((!queue1.isEmpty())&&(!queue2.isEmpty())){
              if(queue1.size()!=queue2.size())return false;
              TreeNode node1 = queue1.remove();
              TreeNode node2 = queue2.remove();
              if(node1.val!=node2.val)return false;
              if((node1.left!=null)&&(node2.left!=null))
              {
                  queue1.add(node1.left);
                  queue2.add(node2.left);
              }
              if((node1.right!=null)&&(node2.right!=null))
              {
                  queue1.add(node1.right);
                  queue2.add(node2.right);
              }

          }
          return true;
      }
  }
