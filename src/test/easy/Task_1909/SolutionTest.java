package easy.Task_1909;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    int [] nums1 = {1,2,10,5,7};

    int [] nums2 = {2,3,1,2};

    int [] nums3 = {1,1,1};

    @Test
    void canBeIncreasing1() {
        assertTrue(solution.canBeIncreasing(nums1));
    }

    @Test
    void canBeIncreasing2() {
        assertFalse(solution.canBeIncreasing(nums2));
    }

    @Test
    void canBeIncreasing3() {
        assertFalse(solution.canBeIncreasing(nums3));
    }
}