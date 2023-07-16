package easy.Task_2670;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    int [] nums1 = {1,2,3,4,5};
    int [] answer1 = {-3,-1,1,3,5};

    int [] nums2 = {3,2,3,4,2};
    int [] answer2 = {-2,-1,0,2,3};

    @Test
    void distinctDifferenceArray1() {
        assertArrayEquals(answer1,solution.distinctDifferenceArray(nums1));
    }

    @Test
    void distinctDifferenceArray2() {
        assertArrayEquals(answer2,solution.distinctDifferenceArray(nums2));
    }
}