package easy.Task_231;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    int n1=1;

    int n2=16;

    int n3=3;

    @Test
    void isPowerOfTwo1() {
        assertTrue(solution.isPowerOfTwo(n1));
    }

    @Test
    void isPowerOfTwo2() {
        assertTrue(solution.isPowerOfTwo(n2));
    }

    @Test
    void isPowerOfTwo3() {
        assertFalse(solution.isPowerOfTwo(n3));
    }
}