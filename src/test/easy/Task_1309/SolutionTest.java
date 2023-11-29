package easy.Task_1309;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    String s1 = "10#11#12";
    String s2 = "1326#";

    @Test
    void freqAlphabets1() {
        assertEquals("jkab",solution.freqAlphabets(s1));
    }

    @Test
    void freqAlphabets2() {
        assertEquals("acz",solution.freqAlphabets(s2));
    }
}