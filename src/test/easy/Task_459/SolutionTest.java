package easy.Task_459;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution =new Solution();

    String s1 = "abab";

    String s2 = "aba";

    String s3 = "abcabcabcabc";


    @Test
    void repeatedSubstringPattern1() {
        assertTrue(solution.repeatedSubstringPattern(s1));
    }

    @Test
    void repeatedSubstringPattern2() {
        assertFalse(solution.repeatedSubstringPattern(s2));
    }

    @Test
    void repeatedSubstringPattern3() {
        assertTrue(solution.repeatedSubstringPattern(s3));
    }

}