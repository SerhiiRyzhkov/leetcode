package easy.Task_2652;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    int n1=7;

    int n2=10;

    int n3=9;

    @Test
    void sumOfMultiples1() {
        assertEquals(21,solution.sumOfMultiples(n1));
    }

    @Test
    void sumOfMultiples2() {
        assertEquals(40,solution.sumOfMultiples(n2));
    }

    @Test
    void sumOfMultiples3() {
        assertEquals(30,solution.sumOfMultiples(n3));
    }
}