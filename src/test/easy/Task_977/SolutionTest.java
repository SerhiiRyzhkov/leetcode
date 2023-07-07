package easy.Task_977;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    int [] nums1 = {-4,-1,0,3,10};
    int [] answer1 = {0,1,9,16,100};

    int [] nums2 = {-7,-3,2,3,11};
    int [] answer2 = {4,9,9,49,121};

    @Test
    void sortedSquares1() {
        assertArrayEquals(answer1,solution.sortedSquares(nums1));
    }

    @Test
    void sortedSquares2() {
        assertArrayEquals(answer2,solution.sortedSquares(nums2));
    }
}