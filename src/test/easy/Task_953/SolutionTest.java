package easy.Task_953;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();

    String [] words1 = {"hello","leetcode"};
    String order1 = "hlabcdefgijkmnopqrstuvwxyz";

    String [] words2 = {"word","world","row"};
    String order2 = "worldabcefghijkmnpqstuvxyz";

    String [] words3 = {"apple","app"};
    String order3 = "abcdefghijklmnopqrstuvwxyz";

    @Test
    void isAlienSorted1() {
        assertTrue(solution.isAlienSorted(words1,order1));
    }

    @Test
    void isAlienSorted2() {
        assertFalse(solution.isAlienSorted(words2,order2));
    }

    @Test
    void isAlienSorted3() {
        assertFalse(solution.isAlienSorted(words3,order3));
    }
}