package easy.Task_1399;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    int n1=13;

    int n2=2;

    @Test
    void countLargestGroup1() {
        assertEquals(4,solution.countLargestGroup(n1));
    }

    @Test
    void countLargestGroup2() {
        assertEquals(2,solution.countLargestGroup(n2));
    }
}