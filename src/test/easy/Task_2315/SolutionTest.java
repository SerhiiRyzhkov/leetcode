package easy.Task_2315;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    String s1 = "l|*e*et|c**o|*de|";

    String s2 = "iamprogrammer";

    String s3 = "yo|uar|e**|b|e***au|tifu|l";

    @Test
    void countAsterisks1() {
        assertEquals(solution.countAsterisks(s1),2);
    }
    @Test
    void countAsterisks2() {
        assertEquals(solution.countAsterisks(s2),0);
    }
    @Test
    void countAsterisks3() {
        assertEquals(solution.countAsterisks(s3),5);
    }
}