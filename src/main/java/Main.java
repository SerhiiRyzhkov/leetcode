import  medium.Task_863.Solution;
import medium.Task_863.TreeNode;


public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
       /* TreeNode root = new TreeNode(3, new TreeNode(5,new TreeNode(6), new TreeNode(2, new TreeNode(7),new TreeNode(4))), new TreeNode(1, new TreeNode(0), new TreeNode(8)));
        TreeNode target = new TreeNode(5,new TreeNode(6), new TreeNode(2, new TreeNode(7), new TreeNode(4)));
        int k = 2;*/

        TreeNode root = new TreeNode(0, new TreeNode(2), new TreeNode(1, new TreeNode(3),null));
        TreeNode target = new TreeNode(3, null, null);
        int k=3;

        System.out.println(solution.distanceK(root,target,k));
    }
}




