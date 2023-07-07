package easy.Task_897;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    TreeNode root1 = new TreeNode(5,new TreeNode(3, new TreeNode(2, new TreeNode(1),null), new TreeNode(4)),new TreeNode(6, null, new TreeNode(8, new TreeNode(7), new TreeNode(9))));
    TreeNode answer1 = new TreeNode(1,null,new TreeNode(2, null, new TreeNode(3, null, new TreeNode(4, null, new TreeNode(5, null, new TreeNode(6, null, new TreeNode(7, null, new TreeNode(8, null, new TreeNode(9, null, new TreeNode())))))))));

    TreeNode root2 = new TreeNode(5, new TreeNode(1), new TreeNode(7));
    TreeNode answer2 = new TreeNode(1, null, new TreeNode(5, null, new TreeNode(7)));

    @Test
    void increasingBST1() {
        assertEquals(answer1,solution.increasingBST(root1));
    }

    @Test
    void increasingBST2() {
        assertEquals(answer2,solution.increasingBST(root2));
    }
}