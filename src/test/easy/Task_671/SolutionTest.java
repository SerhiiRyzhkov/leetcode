package easy.Task_671;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    TreeNode root1 = new TreeNode(2,new TreeNode(2),new TreeNode(5,new TreeNode(5),new TreeNode(7)));
    TreeNode root2 = new TreeNode(2,new TreeNode(2),new TreeNode(2));

    @Test
    void findSecondMinimumValue1() {
        assertEquals(5,solution.findSecondMinimumValue(root1));
    }

    @Test
    void findSecondMinimumValue2() {
        assertEquals(-1,solution.findSecondMinimumValue(root2));
    }
}