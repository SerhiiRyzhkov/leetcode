package medium.Task_2405;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    String s1 = "abacaba";

    String s2 = "ssssss";

    @Test
    void partitionString1() {
        assertEquals(solution.partitionString(s1),4);
    }

    @Test
    void partitionString2() {
        assertEquals(solution.partitionString(s2),6);
    }
}