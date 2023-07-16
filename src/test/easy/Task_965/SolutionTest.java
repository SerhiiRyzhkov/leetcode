package easy.Task_965;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    TreeNode treeNode1 = new TreeNode(1, new TreeNode(1, new TreeNode(1), new TreeNode(1)), new TreeNode(1, null, new TreeNode(1)));

    TreeNode treeNode2 = new TreeNode(2, new TreeNode(2, new TreeNode(5), new TreeNode(2)), new TreeNode(2));

    @Test
    void isUnivalTree1() {
    assertTrue(solution.isUnivalTree(treeNode1));
    }

    @Test
    void isUnivalTree2() {
        assertFalse(solution.isUnivalTree(treeNode2));
    }
}