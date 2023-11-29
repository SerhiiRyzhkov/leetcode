package easy.Task_70;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    int n1=2;

    int n2=3;

    @Test
    void climbStairs1() {
        assertEquals(2,solution.climbStairs(n1));
    }

    @Test
    void climbStairs2() {
        assertEquals(3,solution.climbStairs(n2));
    }
}