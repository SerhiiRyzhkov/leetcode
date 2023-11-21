package easy.Task_674;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    int [] nums1 = {1,3,5,4,7};

    int [] nums2 = {2,2,2,2,2};

    @Test
    void findLengthOfLCIS1() {
        assertEquals(3,solution.findLengthOfLCIS(nums1));
    }

    @Test
    void findLengthOfLCIS2() {
        assertEquals(1,solution.findLengthOfLCIS(nums2));
    }
}