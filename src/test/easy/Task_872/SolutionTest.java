package easy.Task_872;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();

    TreeNode root11 = new TreeNode(3, new TreeNode(5, new TreeNode(6), new TreeNode(2, new TreeNode(7), new TreeNode(4))), new TreeNode(1, new TreeNode(9), new TreeNode(8)));
    TreeNode root12 = new TreeNode(3, new TreeNode(5, new TreeNode(6), new TreeNode(7)), new TreeNode(1, new TreeNode(4), new TreeNode(2, new TreeNode(9), new TreeNode(8))));

    TreeNode root21 = new TreeNode(1, new TreeNode(2), new TreeNode(3));
    TreeNode root22 = new TreeNode(1, new TreeNode(3), new TreeNode(2));


    @Test
    void leafSimilar1() {
        assertTrue(solution.leafSimilar(root11,root12));
    }

    @Test
    void leafSimilar2() {
        assertFalse(solution.leafSimilar(root21,root22));
    }
}