package easy.Task_2566;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();

    int num1 = 11891;

    int num2 = 90;


    @Test
    void minMaxDifference1() {
        assertEquals(99009,solution.minMaxDifference(num1));
    }

    @Test
    void minMaxDifference2() {
        assertEquals(99,solution.minMaxDifference(num2));
    }
}