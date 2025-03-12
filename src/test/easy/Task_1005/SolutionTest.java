package easy.Task_1005;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    int [] nums1 = {4,2,3};
    int k1=1;

    int [] nums2 = {3,-1,0,2};
    int k2=3;

    int [] nums3 = {2,-3,-1,5,-4};
    int k3=2;

    @Test
    void largestSumAfterKNegations1() {
        assertEquals(5,solution.largestSumAfterKNegations(nums1,k1));
    }

    @Test
    void largestSumAfterKNegations2() {
        assertEquals(6,solution.largestSumAfterKNegations(nums2,k2));
    }

    @Test
    void largestSumAfterKNegations3() {
        assertEquals(13,solution.largestSumAfterKNegations(nums3,k3));
    }
}