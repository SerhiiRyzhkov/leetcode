package easy.Task_1945;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();

    String s1 = "iiii";
    int k1=1;

    String s2 = "leetcode";
    int k2=2;

    String s3 = "zbax";
    int k3=2;

    @Test
    void getLucky1() {
        assertEquals(solution.getLucky(s1,k1),36);
    }

    @Test
    void getLucky2() {
        assertEquals(solution.getLucky(s2,k2),6);
    }

    @Test
    void getLucky3() {
        assertEquals(solution.getLucky(s3,k3),8);
    }
}