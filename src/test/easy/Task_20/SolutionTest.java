package easy.Task_20;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    String s1 = "()";

    String s2 = "()[]{}";

    String s3 = "(]";

    @Test
    void isValid1() {
        assertTrue(solution.isValid(s1));
    }

    @Test
    void isValid2() {
        assertTrue(solution.isValid(s2));
    }

    @Test
    void isValid3() {
        assertFalse(solution.isValid(s3));
    }
}