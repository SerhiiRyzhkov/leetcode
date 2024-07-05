package easy.Task_3079;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    int [] nums1 = {1,2,3};
    int [] nums2 = {10,21,31};

    @Test
    void sumOfEncryptedInt1() {
        assertEquals(6,solution.sumOfEncryptedInt(nums1));
    }

    @Test
    void sumOfEncryptedInt2() {
        assertEquals(66,solution.sumOfEncryptedInt(nums2));
    }
}