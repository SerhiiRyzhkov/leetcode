package easy.Task_226;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    TreeNode root1 = new TreeNode(4, new TreeNode(2, new TreeNode(1),new TreeNode(3)), new TreeNode(7, new TreeNode(6), new TreeNode(9)));
    TreeNode result1 =  new TreeNode(4, new TreeNode(7, new TreeNode(9),new TreeNode(6)), new TreeNode(2, new TreeNode(3), new TreeNode(1)));
    TreeNode root2 = new TreeNode(2, new TreeNode(1),new TreeNode(3));
    TreeNode result2 = new TreeNode(2, new TreeNode(3),new TreeNode(1));

    @Test
    void invertTree1() {
        assertEquals(result1,solution.invertTree(root1));
    }


    @Test
    void invertTree2() {
        assertEquals(result2,solution.invertTree(root2));
    }
}