package easy.Task_1342;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    int nums1 = 14;
    int nums2 = 8;
    int nums3 = 123;

    @Test
    void numberOfSteps1() {
        assertEquals(6,solution.numberOfSteps(nums1));
    }
    @Test
    void numberOfSteps2() {
        assertEquals(4,solution.numberOfSteps(nums2));
    }
    @Test
    void numberOfSteps3() {
        assertEquals(12,solution.numberOfSteps(nums3));
    }
}