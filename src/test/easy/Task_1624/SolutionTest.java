package easy.Task_1624;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    String s1 = "aa";

    String s2 = "abca";

    String s3 = "cbzxy";


    @Test
    void maxLengthBetweenEqualCharacters1() {
        assertEquals(0,solution.maxLengthBetweenEqualCharacters(s1));
    }

    @Test
    void maxLengthBetweenEqualCharacters2() {
        assertEquals(2,solution.maxLengthBetweenEqualCharacters(s2));
    }

    @Test
    void maxLengthBetweenEqualCharacters3() {
        assertEquals(-1,solution.maxLengthBetweenEqualCharacters(s3));
    }
}