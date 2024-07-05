package easy.Task_2185;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    String [] words1 = {"pay","attention","practice","attend"};
    String pref1 = "at";

    String [] words2 = {"leetcode","win","loops","success"};
    String pref2 = "code";

    @Test
    void prefixCount1() {
        assertEquals(2,solution.prefixCount(words1,pref1));
    }

    @Test
    void prefixCount2() {
        assertEquals(0,solution.prefixCount(words2,pref2));
    }
}