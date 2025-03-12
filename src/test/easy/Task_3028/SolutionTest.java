package easy.Task_3028;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    int [] nums1 = {2,3,-5};

    int [] nums2 = {3,2,-3,-4};

    @Test
    void returnToBoundaryCount1() {
        assertEquals(1,solution.returnToBoundaryCount(nums1));
    }

    @Test
    void returnToBoundaryCount2() {
        assertEquals(0,solution.returnToBoundaryCount(nums2));
    }
}