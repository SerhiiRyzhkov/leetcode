package medium.Task_863;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    TreeNode root1 = new TreeNode(3, new TreeNode(5,new TreeNode(6), new TreeNode(2, new TreeNode(7),new TreeNode(4))),
            new TreeNode(1, new TreeNode(0), new TreeNode(8)));
    TreeNode target1 = new TreeNode(5,new TreeNode(6), new TreeNode(2, new TreeNode(7), new TreeNode(4)));
    int k1 = 2;
    List<Integer>result1 = new ArrayList<>(Arrays.asList(7,4,1));


    TreeNode root2 = new TreeNode(1);
    TreeNode target2 = new TreeNode(1);
    int k2= 3;
    List<Integer>result2 = new ArrayList<>();

    @Test
    void distanceK1() {
        assertTrue((result1.size()==solution.distanceK(root1,target1,k1).size())&&
                (result1.containsAll(solution.distanceK(root1,target1,k1)))&&
                (solution.distanceK(root1,target1,k1).containsAll(result1)));
    }

    @Test
    void distanceK2() {
        assertTrue((result2.size()==solution.distanceK(root2,target2,k2).size())&&
                (result2.containsAll(solution.distanceK(root2,target2,k2)))&&
                (solution.distanceK(root2,target2,k2).containsAll(result2)));
    }
}