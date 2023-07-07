package easy.Task_219;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    int [] nums1 = {1,2,3,1};
    int k1=3;

    int [] nums2 = {1,0,1,1};
    int k2=1;

    int [] nums3 = {1,2,3,1,2,3};
    int k3=2;

    @Test
    void containsNearbyDuplicate1() {
        assertTrue(solution.containsNearbyDuplicate(nums1,k1));
    }

    @Test
    void containsNearbyDuplicate2() {
        assertTrue(solution.containsNearbyDuplicate(nums2,k2));
    }

    @Test
    void containsNearbyDuplicate3() {
        assertFalse(solution.containsNearbyDuplicate(nums3,k3));
    }
}