package easy.Task_594;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    int [] nums1 = {1,3,2,2,5,2,3,7};

    int [] nums2 = {1,2,3,4};

    int [] nums3 = {1,1,1,1};

    @Test
    void findLHS1() {
        assertEquals(5,solution.findLHS(nums1));
    }

    @Test
    void findLHS2() {
        assertEquals(2,solution.findLHS(nums2));
    }

    @Test
    void findLHS3() {
        assertEquals(0,solution.findLHS(nums3));
    }
}