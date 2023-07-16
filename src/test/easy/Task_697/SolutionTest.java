package easy.Task_697;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    int [] nums1 = {1,2,2,3,1};

    int [] nums2 = {1,2,2,3,1,4,2};

    @Test
    void findShortestSubArray1() {
        assertEquals(2,solution.findShortestSubArray(nums1));
    }

    @Test
    void findShortestSubArray2() {
        assertEquals(6,solution.findShortestSubArray(nums2));
    }

}