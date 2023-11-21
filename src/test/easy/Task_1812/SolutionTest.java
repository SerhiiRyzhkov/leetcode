package easy.Task_1812;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();

    String s1 = "a1";

    String s2 = "h3";

    String s3 = "c7";



    @Test
    void squareIsWhite1() {
        assertFalse(solution.squareIsWhite(s1));
    }

    @Test
    void squareIsWhite2() {
        assertTrue(solution.squareIsWhite(s2));
    }

    @Test
    void squareIsWhite3() {
        assertFalse(solution.squareIsWhite(s3));
    }
}