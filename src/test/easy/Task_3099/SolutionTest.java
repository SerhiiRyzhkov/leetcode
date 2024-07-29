package easy.Task_3099;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    int x1 = 18;

    int x2 = 23;

    @Test
    void sumOfTheDigitsOfHarshadNumber1() {
        assertEquals(9,solution.sumOfTheDigitsOfHarshadNumber(x1));
    }

    @Test
    void sumOfTheDigitsOfHarshadNumber2() {
        assertEquals(-1,solution.sumOfTheDigitsOfHarshadNumber(x2));
    }
}