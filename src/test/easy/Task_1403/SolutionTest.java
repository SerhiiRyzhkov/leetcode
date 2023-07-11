package easy.Task_1403;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    int [] nums1 = {4,3,10,9,8};
    List<Integer>result1 = new ArrayList<>(Arrays.asList(10,9));

    int [] nums2 = {4,4,7,6,7};
    List<Integer>result2 = new ArrayList<>(Arrays.asList(7,7,6));

    @Test
    void minSubsequence1() {
        assertEquals(result1,solution.minSubsequence(nums1));
    }

    @Test
    void minSubsequence2() {
        assertEquals(result2,solution.minSubsequence(nums2));
    }
}