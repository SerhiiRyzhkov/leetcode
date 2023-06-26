package easy.Task_993;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    TreeNode treeNode1 = new TreeNode(1, new TreeNode(2, new TreeNode(4),null),new TreeNode(3));
    int x1=4;
    int y1=3;

    TreeNode treeNode2 = new TreeNode(1, new TreeNode(2,null,new TreeNode(4)), new TreeNode(3,null,new TreeNode(5)));
    int x2=5;
    int y2=4;

    TreeNode treeNode3 = new TreeNode(1, new TreeNode(2,null,new TreeNode(4)),new TreeNode(3));
    int x3=2;
    int y3=3;

    @Test
    void isCousins1() {
        assertFalse(solution.isCousins(treeNode1,x1,y1));
    }


    @Test
    void isCousins2() {
        assertTrue(solution.isCousins(treeNode2,x2,y2));
    }


    @Test
    void isCousins3() {
        assertFalse(solution.isCousins(treeNode3,x3,y3));
    }
}