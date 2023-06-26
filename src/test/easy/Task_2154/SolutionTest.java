package easy.Task_2154;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    int [] nums1 = {5,3,6,1,12};
    int original1 = 3;

    int [] nums2 = {2,7,9};
    int original2 = 4;

    @Test
    void findFinalValue1() {
        assertEquals(24,solution.findFinalValue(nums1,original1));
    }

    @Test
    void findFinalValue2() {
        assertEquals(4,solution.findFinalValue(nums2,original2));
    }
}