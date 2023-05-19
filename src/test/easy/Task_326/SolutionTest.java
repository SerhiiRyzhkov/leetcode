package easy.Task_326;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    int n1=27;

    int n2=0;

    int n3=-1;

    @Test
    void isPowerOfThree1() {
        assertTrue(solution.isPowerOfThree(n1));
    }

    @Test
    void isPowerOfThree2() {
        assertFalse(solution.isPowerOfThree(n2));
    }

    @Test
    void isPowerOfThree3() {
        assertFalse(solution.isPowerOfThree(n3));
    }
}