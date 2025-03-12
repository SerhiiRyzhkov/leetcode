package easy.Task_3232;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();
    int [] nums1 = {1,2,3,4,10};

    int [] nums2 = {1,2,3,4,5,14};

    int [] nums3 = {5,5,5,25};

    @Test
    void canAliceWin1() {
        assertFalse(solution.canAliceWin(nums1));
    }

    @Test
    void canAliceWin2() {
        assertTrue(solution.canAliceWin(nums2));
    }

    @Test
    void canAliceWin3() {
        assertTrue(solution.canAliceWin(nums3));
    }
}