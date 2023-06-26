package easy.Task_13;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    String s1 = "III";

    String s2 = "LVIII";

    String s3= "MCMXCIV";

    @Test
    void romanToInt1() {
        assertEquals(3,solution.romanToInt(s1));
    }

    @Test
    void romanToInt2() {
        assertEquals(58,solution.romanToInt(s2));
    }

    @Test
    void romanToInt3() {
        assertEquals(1994,solution.romanToInt(s3));
    }
}