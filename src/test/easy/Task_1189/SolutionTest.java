package easy.Task_1189;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    String text1 = "nlaebolko";

    String text2 = "loonbalxballpoon";

    String text3 = "leetcode";

    @Test
    void maxNumberOfBalloons1() {
        assertEquals(1,solution.maxNumberOfBalloons(text1));
    }

    @Test
    void maxNumberOfBalloon2() {
        assertEquals(2,solution.maxNumberOfBalloons(text2));
    }

    @Test
    void maxNumberOfBalloon3() {
        assertEquals(0,solution.maxNumberOfBalloons(text3));
    }
}