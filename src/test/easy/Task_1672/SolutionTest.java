package easy.Task_1672;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();

    int [][] accounts1 = {{1,2,3},{3,2,1}};

    int [][] accounts2 = {{1,5},{7,3},{3,5}};

    int [][] accounts3 = {{2,8,7},{7,1,3},{1,9,5}};


    @Test
    void maximumWealth1() {
        assertEquals(6,solution.maximumWealth(accounts1));
    }

    @Test
    void maximumWealth2() {
        assertEquals(10,solution.maximumWealth(accounts2));
    }

    @Test
    void maximumWealth3() {
        assertEquals(17,solution.maximumWealth(accounts3));
    }
}