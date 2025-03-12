package easy.Task_414;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    int [] nums1 = {3,2,1};

    int [] nums2 = {1,2};

    int [] nums3 = {2,2,3,1};

    @Test
    void thirdMax1() {
        assertEquals(1,solution.thirdMax(nums1));
    }

    @Test
    void thirdMax2() {
        assertEquals(2,solution.thirdMax(nums2));
    }

    @Test
    void thirdMax3() {
        assertEquals(1,solution.thirdMax(nums3));
    }
}