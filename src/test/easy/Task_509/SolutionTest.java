package easy.Task_509;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    int n1 = 2;

    int n2 = 3;

    int n3 = 4;

    @Test
    void fib1() {
        assertEquals(1,solution.fib(n1));
    }

    @Test
    void fib2() {
        assertEquals(2,solution.fib(n2));
    }

    @Test
    void fib3() {
        assertEquals(3,solution.fib(n3));
    }
}