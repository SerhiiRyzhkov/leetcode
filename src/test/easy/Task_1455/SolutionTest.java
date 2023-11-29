package easy.Task_1455;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    String sentence1 = "i love eating burger";
    String searchWord1 = "burg";

    String sentence2 = "this problem is an easy problem";
    String searchWord2 = "pro";

    String sentence3 = "i am tired";
    String searchWord3 = "you";

    @Test
    void isPrefixOfWord1() {
        assertEquals(4,solution.isPrefixOfWord(sentence1,searchWord1));
    }

    @Test
    void isPrefixOfWord2() {
        assertEquals(2,solution.isPrefixOfWord(sentence2,searchWord2));
    }

    @Test
    void isPrefixOfWord3() {
        assertEquals(-1,solution.isPrefixOfWord(sentence3,searchWord3));
    }
}