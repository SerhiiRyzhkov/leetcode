package easy.Task_1748;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    int [] nums1 = {1,2,3,2};

    int [] nums2 = {1,1,1,1,1};

    int [] nums3 = {1,2,3,4,5};

    @Test
    void sumOfUnique1() {
        assertEquals(4,solution.sumOfUnique(nums1));
    }

    @Test
    void sumOfUnique2() {
        assertEquals(0,solution.sumOfUnique(nums2));
    }

    @Test
    void sumOfUnique3() {
        assertEquals(15,solution.sumOfUnique(nums3));
    }

}