package easy.Task_1984;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    int [] nums1 = {90};
    int k1=1;

    int [] nums2 = {9,4,1,7};
    int k2=2;

    int [] nums3 = {87063,61094,44530,21297,95857,93551,9918};
    int k3= 6;


    @Test
    void minimumDifference1() {
        assertEquals(0,solution.minimumDifference(nums1,k1));
    }

    @Test
    void minimumDifference2() {
        assertEquals(2,solution.minimumDifference(nums2,k2));
    }

    @Test
    void minimumDifference3() {
        assertEquals(74560,solution.minimumDifference(nums3,k3));
    }
}