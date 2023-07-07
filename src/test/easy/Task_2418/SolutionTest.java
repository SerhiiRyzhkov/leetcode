package easy.Task_2418;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    String [] names1 = {"Mary","John","Emma"};
    int [] heights1 = {180,165,170};
    String [] answer1 = {"Mary","Emma","John"};

    String [] names2 = {"Alice","Bob","Bob"};
    int [] heights2 = {155,185,150};
    String [] answer2 = {"Bob","Alice","Bob"};

    @Test
    void sortPeople1() {
        assertArrayEquals(answer1,solution.sortPeople(names1,heights1));
    }

    @Test
    void sortPeople2() {
        assertArrayEquals(answer2,solution.sortPeople(names2,heights2));
    }
}