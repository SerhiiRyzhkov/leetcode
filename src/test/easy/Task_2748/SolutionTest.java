package easy.Task_2748;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    int [] nums1 = {2,5,1,4};

    int [] nums2 = {11,21,12};

    @Test
    void countBeautifulPairs1() {
        assertEquals(5,solution.countBeautifulPairs(nums1));
    }

}