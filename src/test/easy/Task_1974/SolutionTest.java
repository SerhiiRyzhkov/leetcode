package easy.Task_1974;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    String word1 = "abc";
    String word2 = "bza";
    String word3 = "zjpc";

    @Test
    void minTimeToType1() {
        assertEquals(5,solution.minTimeToType(word1));
    }

    @Test
    void minTimeToType2() {
        assertEquals(7,solution.minTimeToType(word2));
    }

    @Test
    void minTimeToType3() {
        assertEquals(34,solution.minTimeToType(word3));
    }

}