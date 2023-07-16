package easy.Task_1491;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    int [] salary1 = {4000,3000,1000,2000};

    int [] salary2 = {1000,2000,3000};

    @Test
    void average1() {
        assertEquals(2500.00000,solution.average(salary1));
    }


    @Test
    void average2() {
        assertEquals(2000.00000,solution.average(salary2));
    }
}