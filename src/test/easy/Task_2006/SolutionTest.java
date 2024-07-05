package easy.Task_2006;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    int [] nums1={1,2,2,1};
    int k1 = 1;

    int [] nums2={1,3};
    int k2 = 3;

    int [] nums3={3,2,1,5,4};
    int k3 = 2;

    @Test
    void countKDifference1() {
        assertEquals(4,solution.countKDifference(nums1,k1));
    }

    @Test
    void countKDifference2() {
        assertEquals(0,solution.countKDifference(nums2,k2));
    }

    @Test
    void countKDifference3() {
        assertEquals(3,solution.countKDifference(nums3,k3));
    }
}