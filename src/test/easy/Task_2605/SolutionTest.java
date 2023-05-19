package easy.Task_2605;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    int [] nums1_1 = {4,1,3};
    int [] nums2_1 = {5,7};

    int [] nums1_2 = {3,5,2,6};
    int [] nums2_2 = {3,1,7};

    @Test
    void minNumber1() {
        assertEquals(solution.minNumber(nums1_1,nums2_1),15);
    }

    @Test
    void minNumber2() {
        assertEquals(solution.minNumber(nums1_2,nums2_2),3);
    }

}