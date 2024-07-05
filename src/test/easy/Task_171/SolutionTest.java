package easy.Task_171;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();
    String columnTitle1 = "A";
    String columnTitle2 = "AB";
    String columnTitle3 = "ZY";

    @Test
    void titleToNumber1() {
        assertEquals(1,solution.titleToNumber(columnTitle1));
    }

    @Test
    void titleToNumber2() {
        assertEquals(28,solution.titleToNumber(columnTitle2));
    }

    @Test
    void titleToNumber3() {
        assertEquals(701,solution.titleToNumber(columnTitle3));
    }
}