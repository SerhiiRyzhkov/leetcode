package easy.Task_783;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    TreeNode root1 = new TreeNode(4, new TreeNode(2,new TreeNode(1), new TreeNode(3)), new TreeNode(6));
    TreeNode root2 = new TreeNode(1,  new TreeNode(0), new TreeNode(48,new TreeNode(12), new TreeNode(49)));


    @Test
    void minDiffInBST1() {
        assertEquals(1,solution.minDiffInBST(root1));
    }

    @Test
    void minDiffInBST2() {
        assertEquals(1,solution.minDiffInBST(root2));
    }
}