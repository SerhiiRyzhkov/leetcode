package easy.Task_2283;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    String num1 = "1210";
    String num2 = "030";

    @Test
    void digitCount1() {
        assertTrue(solution.digitCount(num1));
    }

    @Test
    void digitCount2() {
        assertFalse(solution.digitCount(num2));
    }
}