package easy.Task_1662;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    String[] word11 = {"ab", "c"};
    String[] word21 = {"a", "bc"};

    String[] word12 = {"a", "cb"};
    String[] word22 = {"ab", "c"};

    String[] word13 = {"abc", "d", "defg"};
    String[] word23 = {"abcddefg"};

    @Test
    void arrayStringsAreEqual1() {
        assertTrue(solution.arrayStringsAreEqual(word11,word21));
    }

    @Test
    void arrayStringsAreEqual2() {
        assertFalse(solution.arrayStringsAreEqual(word12,word22));
    }

    @Test
    void arrayStringsAreEqual3() {
        assertTrue(solution.arrayStringsAreEqual(word13,word23));
    }
}