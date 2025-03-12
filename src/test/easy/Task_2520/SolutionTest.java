package easy.Task_2520;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();
    int num1 = 7;
    int num2 = 121;
    int num3 = 1248;

    @Test
    void countDigits1() {
        assertEquals(1,solution.countDigits(num1));
    }

    @Test
    void countDigits2() {
        assertEquals(2,solution.countDigits(num2));
    }

    @Test
    void countDigits3() {
        assertEquals(4,solution.countDigits(num3));
    }
}