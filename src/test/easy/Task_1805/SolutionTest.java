package easy.Task_1805;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    String word1 = "a123bc34d8ef34";

    String word2 = "leet1234code234";

    String word3 = "a1b01c001";


    @Test
    void numDifferentIntegers1() {
        assertEquals(3,solution.numDifferentIntegers(word1));
    }

    @Test
    void numDifferentIntegers2() {
        assertEquals(2,solution.numDifferentIntegers(word2));
    }

    @Test
    void numDifferentIntegers3() {
        assertEquals(1,solution.numDifferentIntegers(word3));
    }


}