package easy.Task_169;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    int [] nums1 = {3,2,3};

    int [] nums2 = {2,2,1,1,1,2,2};

    @Test
    void majorityElement1() {
        assertEquals(3,solution.majorityElement(nums1));
    }

    @Test
    void majorityElement2() {
        assertEquals(2,solution.majorityElement(nums2));
    }

}