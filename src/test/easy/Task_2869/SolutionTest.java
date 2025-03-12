package easy.Task_2869;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();
    List<Integer> nums1 = new ArrayList<>(List.of(3,1,5,4,2));
    int k1=2;

    List<Integer> nums2 = new ArrayList<>(List.of(3,1,5,4,2));
    int k2=5;

    List<Integer> nums3 = new ArrayList<>(List.of(3,2,5,3,1));
    int k3=3;

    @Test
    void minOperations1() {
        assertEquals(4,solution.minOperations(nums1,k1));
    }

    @Test
    void minOperations2() {
        assertEquals(5,solution.minOperations(nums2,k2));
    }

    @Test
    void minOperations3() {
        assertEquals(4,solution.minOperations(nums3,k3));
    }
}