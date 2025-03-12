package easy.Task_3110;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    String s1 = "hello";
    String s2 = "zaz";

    @Test
    void scoreOfString1() {
        assertEquals(13,solution.scoreOfString(s1));
    }

    @Test
    void scoreOfString2() {
        assertEquals(50,solution.scoreOfString(s2));
    }
}