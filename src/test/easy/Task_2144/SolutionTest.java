package easy.Task_2144;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    int [] cost1 = {1,2,3};

    int [] cost2 = {6,5,7,9,2,2};

    int [] cost3 = {5,5};

    int [] cost4 = {3,3,3,1};



    @Test
    void minimumCost1() {
        assertEquals(5,solution.minimumCost(cost1));
    }

    @Test
    void minimumCost2() {
        assertEquals(23,solution.minimumCost(cost2));
    }

    @Test
    void minimumCost3() {
        assertEquals(10,solution.minimumCost(cost3));
    }

    @Test
    void minimumCost4() {
        assertEquals(7,solution.minimumCost(cost4));
    }
}