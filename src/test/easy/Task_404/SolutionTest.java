package easy.Task_404;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();

    TreeNode treeNode1 = new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7)));

    TreeNode treeNode2 = new TreeNode(1);


    @Test
    void sumOfLeftLeaves1() {
    assertEquals(solution.sumOfLeftLeaves(treeNode1),24);
    }


    @Test
    void sumOfLeftLeaves2() {
        assertEquals(solution.sumOfLeftLeaves(treeNode2),0);
    }
}