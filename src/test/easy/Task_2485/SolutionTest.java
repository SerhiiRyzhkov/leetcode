package easy.Task_2485;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    int n1 = 8;
    int n2 = 1;
    int n3 = 4;

    @Test
    void pivotInteger1() {
        assertEquals(6,solution.pivotInteger(n1));
    }

    @Test
    void pivotInteger2() {
        assertEquals(1,solution.pivotInteger(n2));
    }

    @Test
    void pivotInteger3() {
        assertEquals(-1,solution.pivotInteger(n3));
    }

}