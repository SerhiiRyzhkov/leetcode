package medium.Task_1218;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    int [] arr1 = {1,2,3,4};
    int difference1 = 1;

    int [] arr2 = {1,3,5,7};
    int difference2 = 1;

    int [] arr3 = {1,5,7,8,5,3,4,2,1};
    int difference3 = -2;

    @Test
    void longestSubsequence1() {
        assertEquals(4,solution.longestSubsequence(arr1,difference1));
    }

    @Test
    void longestSubsequence2() {
        assertEquals(1,solution.longestSubsequence(arr2,difference2));
    }

    @Test
    void longestSubsequence3() {
        assertEquals(4,solution.longestSubsequence(arr3,difference3));
    }
}