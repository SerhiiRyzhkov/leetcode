package easy.Task_3105;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();
    int [] nums1 = {1,4,3,3,2};
    int [] nums2 = {3,3,3,3};

    @Test
    void longestMonotonicSubarray1() {
        assertEquals(2,solution.longestMonotonicSubarray(nums1));
    }

    @Test
    void longestMonotonicSubarray2() {
        assertEquals(1,solution.longestMonotonicSubarray(nums2));
    }
}