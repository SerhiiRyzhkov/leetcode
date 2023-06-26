package easy.Task_2057;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    int [] nums1 = {0,1,2};

    int [] nums2 = {4,3,2,1};

    int [] nums3 = {1,2,3,4,5,6,7,8,9,0};

    int [] nums4 = {7,8,3,5,2,6,3,1,1,4,5
            ,4,8,7,2,0,9,9,0,5,7,1,6};

    @Test
    void smallestEqual1() {
        assertEquals(0,solution.smallestEqual(nums1));
    }

    @Test
    void smallestEqual2() {
        assertEquals(2,solution.smallestEqual(nums2));
    }

    @Test
    void smallestEqual3() {
        assertEquals(-1,solution.smallestEqual(nums3));
    }

    @Test
    void smallestEqual4() {
        assertEquals(21,solution.smallestEqual(nums4));
    }
}