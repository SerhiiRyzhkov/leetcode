package leet144;

import java.util.*;

public class Binary_Tree_Preorder_Traversal {
    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(1, null, new TreeNode(2, new TreeNode(3), null));
        //TreeNode treeNode = null;
        System.out.println(preorderTraversal(treeNode));
    }

    public static List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        List<TreeNode> visited = new ArrayList<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            System.out.println(node);
            if (node != null)
                result.add(node.val);
            else break;
            if ((node.right != null) && (!visited.contains(node.right))) stack.push(node.right);
            if ((node.left != null) && (!visited.contains(node.left))) stack.push(node.left);


        }


        return result;
    }
}


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

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
