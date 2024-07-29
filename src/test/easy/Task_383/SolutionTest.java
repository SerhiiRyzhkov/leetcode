package easy.Task_383;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    String ransomNote1 = "a";
    String magazine1 = "b";

    String ransomNote2 = "aa";
    String magazine2 = "ab";

    String ransomNote3 = "aa";
    String magazine3 = "aab";


    @Test
    void canConstruct1() {
        assertFalse(solution.canConstruct(ransomNote1,magazine1));
    }

    @Test
    void canConstruct2() {
        assertFalse(solution.canConstruct(ransomNote2,magazine2));
    }

    @Test
    void canConstruct3() {
        assertTrue(solution.canConstruct(ransomNote3,magazine3));
    }
}