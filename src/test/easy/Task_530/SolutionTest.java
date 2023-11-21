package easy.Task_530;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    TreeNode treeNode1 = new TreeNode(4, new TreeNode(2,new TreeNode(1),new TreeNode(3)), new TreeNode(6));

    TreeNode treeNode2 = new TreeNode(1, new TreeNode(0), new TreeNode(48, new TreeNode(12), new TreeNode(49)));

    @Test
    void getMinimumDifference1() {
        assertEquals(1,solution.getMinimumDifference(treeNode1));
    }

    @Test
    void getMinimumDifference2() {
        assertEquals(1,solution.getMinimumDifference(treeNode2));
    }
}