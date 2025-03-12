package easy.Task_2717;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    int [] nums1 = {2,1,4,3};
    int [] nums2 = {2,4,1,3};
    int [] nums3 = {1,3,4,2,5};

    @Test
    void semiOrderedPermutation1() {
        assertEquals(2,solution.semiOrderedPermutation(nums1));
    }

    @Test
    void semiOrderedPermutation2() {
        assertEquals(3,solution.semiOrderedPermutation(nums2));
    }

    @Test
    void semiOrderedPermutation3() { assertEquals(0,solution.semiOrderedPermutation(nums3)); }
}