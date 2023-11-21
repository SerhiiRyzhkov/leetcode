package easy.Task_1859;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    String s1 = "is2 sentence4 This1 a3";

    String s2 = "Myself2 Me1 I4 and3";

    @Test
    void sortSentence1() {
        assertEquals("This is a sentence", solution.sortSentence(s1));
    }

    @Test
    void sortSentence2() {
        assertEquals("Me Myself and I", solution.sortSentence(s2));
    }
}