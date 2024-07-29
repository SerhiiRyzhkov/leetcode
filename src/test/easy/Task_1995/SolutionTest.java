package easy.Task_1995;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    int [] nums1 = {1,2,3,6};
    int [] nums2 = {3,3,6,4,5};
    int [] nums3 = {1,1,1,3,5};

    @Test
    void countQuadruplets1() {
        assertEquals(1,solution.countQuadruplets(nums1));
    }

    @Test
    void countQuadruplets2() {
        assertEquals(0,solution.countQuadruplets(nums2));
    }

    @Test
    void countQuadruplets3() {
        assertEquals(4,solution.countQuadruplets(nums3));
    }
}