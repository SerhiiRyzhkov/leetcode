package easy.Task_2160;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    int num1 = 2932;

    int num2 = 4009;

    @Test
    void minimumSum1() {
        assertEquals(52,solution.minimumSum(num1));
    }

    @Test
    void minimumSum2() {
        assertEquals(13,solution.minimumSum(num2));
    }
}