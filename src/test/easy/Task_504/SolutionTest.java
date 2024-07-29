package easy.Task_504;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    int num1 = 100;

    int num2 = -7;

    @Test
    void convertToBase71() {
        assertEquals("202",solution.convertToBase7(num1));
    }

    @Test
    void convertToBase72() {
        assertEquals("-10",solution.convertToBase7(num2));
    }
}