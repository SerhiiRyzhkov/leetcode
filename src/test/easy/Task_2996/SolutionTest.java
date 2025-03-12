package easy.Task_2996;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    int [] nums1 = {1,2,3,2,5};

    int [] nums2 = {3,4,5,1,12,14,13};

    @Test
    void missingInteger1() {
        assertEquals(6,solution.missingInteger(nums1));
    }

    @Test
    void missingInteger2(){
    assertEquals(15,solution.missingInteger(nums2));
    }
}