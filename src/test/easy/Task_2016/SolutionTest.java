package easy.Task_2016;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    int [] nums1 = {7,1,5,4};

    int [] nums2 = {9,4,3,2};

    int [] nums3 = {1,5,2,10};

    @Test
    void maximumDifference1() {
        assertEquals(4,solution.maximumDifference(nums1));
    }

    @Test
    void maximumDifference2() {
        assertEquals(-1,solution.maximumDifference(nums2));
    }

    @Test
    void maximumDifference3() {
        assertEquals(9,solution.maximumDifference(nums3));
    }
}