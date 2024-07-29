package easy.Task_2824;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    List<Integer> nums1 = List.of(-1,1,2,3,1);
    int target1 = 2;

    List<Integer> nums2 = List.of(-6,2,5,-2,-7,-1,3);
    int target2 = -2;

    @Test
    void countPairs1() {
        assertEquals(3,solution.countPairs(nums1,target1));
    }

    @Test
    void countPairs2() {
        assertEquals(10,solution.countPairs(nums2,target2));
    }
}