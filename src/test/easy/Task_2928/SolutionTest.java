package easy.Task_2928;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    int n1 = 5;
    int limit1 = 2;


    int n2 = 3;
    int limit2 = 3;


    @Test
    void distributeCandies1() {
        assertEquals(3,solution.distributeCandies(n1,limit1));
    }


    @Test
    void distributeCandies2() {
        assertEquals(10,solution.distributeCandies(n2,limit2));
    }
}