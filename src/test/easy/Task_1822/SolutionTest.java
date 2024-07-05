package easy.Task_1822;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();

    int [] nums1 = {-1,-2,-3,-4,3,2,1};

    int [] nums2 = {1,5,0,2,-3};

    int [] nums3 = {-1,1,-1,1,-1};

    @Test
    void arraySign1() {
        assertEquals(1,solution.arraySign(nums1));
    }

    @Test
    void arraySign2() {
        assertEquals(0,solution.arraySign(nums2));
    }

    @Test
    void arraySign3() {
        assertEquals(-1,solution.arraySign(nums3));
    }

}