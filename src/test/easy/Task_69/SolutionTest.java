package easy.Task_69;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    int x1=4;

    int x2=8;

    @Test
    void mySqrt1() {
        assertEquals(2,solution.mySqrt(x1));
    }

    @Test
    void mySqrt2() {
        assertEquals(2,solution.mySqrt(x2));
    }
}