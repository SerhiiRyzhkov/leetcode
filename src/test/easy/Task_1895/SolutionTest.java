package easy.Task_1895;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    String s1 = "is2 sentence4 This1 a3";
    String answer1 = "This is a sentence";

    String s2 = "Myself2 Me1 I4 and3";
    String answer2 = "Me Myself and I";

    @Test
    void sortSentence1() {
        assertEquals(answer1,solution.sortSentence(s1));
    }

    @Test
    void sortSentence2() {
        assertEquals(answer2,solution.sortSentence(s2));
    }
}