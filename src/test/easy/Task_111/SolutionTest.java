package easy.Task_111;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    TreeNode treeNode1 = new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15),new TreeNode(7)));

    TreeNode treeNode2 = new TreeNode(2,null,new TreeNode(3,null, new TreeNode(4, null, new TreeNode(5, null, new TreeNode(6)))));


    @Test
    void minDepth1() {
        assertEquals(2,solution.minDepth(treeNode1));
    }

    @Test
    void minDepth2() {
        assertEquals(5,solution.minDepth(treeNode2));
    }
}