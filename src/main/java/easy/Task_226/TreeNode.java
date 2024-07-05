package easy.Task_226;

public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      public TreeNode(int val) { this.val = val; }
      public TreeNode(int val, TreeNode left, TreeNode right) {
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
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        TreeNode treeNode = (TreeNode) obj;
        return val == treeNode.val &&
                (left != null ? left.equals(treeNode.left) : treeNode.left == null) &&
                (right != null ? right.equals(treeNode.right) : treeNode.right == null);
    }
}
