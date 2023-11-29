package easy.Task_1281;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    int n1=234;

    int n2=4421;

    @Test
    void subtractProductAndSum1() {
        assertEquals(15,solution.subtractProductAndSum(n1));
    }

    @Test
    void subtractProductAndSum2() {
        assertEquals(21,solution.subtractProductAndSum(n2));
    }
}