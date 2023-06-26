package easy.Task_144;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    TreeNode treeNode1 = new TreeNode(1,null,new TreeNode(2,new TreeNode(3),null));
    List<Integer> result1 = new ArrayList<>(Arrays.asList(1,2,3));

    TreeNode treeNode2 = null;
    List<Integer> result2 = new ArrayList<>();

    TreeNode treeNode3 = new TreeNode(1);
    List<Integer> result3 = new ArrayList<>(Arrays.asList(1));

    @Test
    void preorderTraversal1() {
        assertEquals(result1,solution.preorderTraversal(treeNode1));
    }

    @Test
    void preorderTraversal2() {
        assertEquals(result2,solution.preorderTraversal(treeNode2));
    }

    @Test
    void preorderTraversal3() {
        assertEquals(result3,solution.preorderTraversal(treeNode3));
    }
}