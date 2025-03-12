package easy.Task_3024;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    int [] nums1 = {3,3,3};

    int [] nums2 = {3,4,5};

    @Test
    void triangleType1() {
    assertEquals("equilateral",solution.triangleType(nums1));
    }

    @Test
    void triangleType2() {
        assertEquals("scalene",solution.triangleType(nums2));
    }
}