package easy.Task_136;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    int [] nums1 = {2,2,1};

    int [] nums2 = {4,1,2,1,2};

    int [] nums3 = {1};

    @Test
    void singleNumber1() {
        assertEquals(1,solution.singleNumber(nums1));
    }

    @Test
    void singleNumber2() {
        assertEquals(4,solution.singleNumber(nums2));
    }

    @Test
    void singleNumber3() {
        assertEquals(1,solution.singleNumber(nums3));
    }
}