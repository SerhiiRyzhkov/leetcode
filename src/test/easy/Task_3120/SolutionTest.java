package easy.Task_3120;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();
    String word1 = "aaAbcBC";
    String word2 = "abc";

    @Test
    void numberOfSpecialChars1() {
        assertEquals(3,solution.numberOfSpecialChars(word1));
    }

    @Test
    void numberOfSpecialChars2() {
        assertEquals(0,solution.numberOfSpecialChars(word2));
    }
}