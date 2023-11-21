package easy.Task_1422;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    String s1 = "011101";

    String s2 = "00111";

    String s3 = "1111";

    @Test
    void maxScore1() {
        assertEquals(5,solution.maxScore(s1));
    }


    @Test
    void maxScore2() {
        assertEquals(5,solution.maxScore(s2));
    }


    @Test
    void maxScore3() {
        assertEquals(3,solution.maxScore(s3));
    }
}