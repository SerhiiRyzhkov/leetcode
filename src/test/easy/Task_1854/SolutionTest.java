package easy.Task_1854;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();

    int [][] logs1 = {{1993,1999},{2000,2010}};

    int [][] logs2 = {{1950,1961},{1960,1971},{1970,1981}};

    @Test
    void maximumPopulation1() {
        assertEquals(1993,solution.maximumPopulation(logs1));
    }

    @Test
    void maximumPopulation2() {
        assertEquals(1960,solution.maximumPopulation(logs2));
    }
}