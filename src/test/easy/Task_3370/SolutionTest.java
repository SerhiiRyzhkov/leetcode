package easy.Task_3370;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    int n1=5;

    int n2=10;

    int n3=3;

    @Test
    void smallestNumber1() {
        assertEquals(7,solution.smallestNumber(n1));
    }

    @Test
    void smallestNumber2() {
        assertEquals(15,solution.smallestNumber(n2));
    }

    @Test
    void smallestNumber3() {
        assertEquals(3,solution.smallestNumber(n3));
    }

}