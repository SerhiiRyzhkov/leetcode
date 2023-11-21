package easy.Task_507;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();

    int num1=28;

    int num2=7;

    @Test
    void checkPerfectNumber1() {
        assertTrue(solution.checkPerfectNumber(num1));
    }

    @Test
    void checkPerfectNumber2() {
        assertFalse(solution.checkPerfectNumber(num2));
    }
}