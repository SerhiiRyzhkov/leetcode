package easy.Task_112;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    TreeNode root1 = new TreeNode(5, new TreeNode(4, new TreeNode(11, new TreeNode(7),new TreeNode(2)),null), new TreeNode(8, new TreeNode(13), new TreeNode(4, null, new TreeNode(1))));
    int targetSum1 = 22;

    TreeNode root2 = new TreeNode(1, new TreeNode(2), new TreeNode(3));
    int targetSum2 = 5;

    TreeNode root3 = null;
    int targetSum3 = 0;

    @Test
    void hasPathSum1() {
        assertTrue(solution.hasPathSum(root1,targetSum1));
    }

    @Test
    void hasPathSum2() {
        assertFalse(solution.hasPathSum(root2,targetSum2));
    }

    @Test
    void hasPathSum3() {
        assertFalse(solution.hasPathSum(root3,targetSum3));
    }
}