package easy.Task_2441;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    int [] nums1 = {-1,2,-3,3};

    int [] nums2 = {-1,10,6,7,-7,1};

    int [] nums3 = {-10,8,6,7,-2,-3};

    @Test
    void findMaxK1() {
        assertEquals(3,solution.findMaxK(nums1));
    }

    @Test
    void findMaxK2() {
        assertEquals(7,solution.findMaxK(nums2));
    }

    @Test
    void findMaxK3() {
        assertEquals(-1,solution.findMaxK(nums3));
    }
}