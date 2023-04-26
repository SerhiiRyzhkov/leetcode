package easy.Task_922;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    int [] nums1 = {4,2,5,7};
    int [] result1 = {4, 5, 2, 7};

    int [] nums2 = {2,3};
    int [] result2= {2,3};

    @Test
    void sortArrayByParityII1() {
        assertArrayEquals(solution.sortArrayByParityII(nums1),result1);
    }

    @Test
    void sortArrayByParityII2() {
        assertArrayEquals(solution.sortArrayByParityII(nums2),result2);
    }
}