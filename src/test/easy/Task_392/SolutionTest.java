package easy.Task_392;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();

    String s1 = "abc";
    String t1 = "ahbgdc";

    String s2 = "axc";
    String t2 = "ahbgdc";


    @Test
    void isSubsequence1() {
        assertTrue(solution.isSubsequence(s1,t1));
    }

    @Test
    void isSubsequence2() {
        assertFalse(solution.isSubsequence(s2,t2));
    }
}