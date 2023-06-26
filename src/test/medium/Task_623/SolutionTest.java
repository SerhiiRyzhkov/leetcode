package medium.Task_623;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    TreeNode treeNode1 = new TreeNode(4, new TreeNode(2, new TreeNode(3), new TreeNode(1)), new TreeNode(6, new TreeNode(5),null));
    int val1=1;
    int depth1=2;
    TreeNode answer1 = new TreeNode(4, new TreeNode(1,new TreeNode(2,new TreeNode(3),new TreeNode(1)),null),new TreeNode(1,null,new TreeNode(6,new TreeNode(5),null)));


    TreeNode treeNode2 = new TreeNode(4, new TreeNode(2,new TreeNode(3),new TreeNode(1)),null);
    int val2=1;
    int depth2=3;
    TreeNode answer2 = new TreeNode(4,new TreeNode(2,new TreeNode(1,new TreeNode(3),null),new TreeNode(1,null,new TreeNode(1))),null);


    @Test
    void addOneRow1() {
        assertEquals(answer1,solution.addOneRow(treeNode1,val1,depth1));
    }

    @Test
    void addOneRow2() {
        assertEquals(answer2,solution.addOneRow(treeNode2,val2,depth2));
    }
}