package easy.Task_1221;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    String s1="RLRRLLRLRL";

    String s2="RLRRRLLRLL";

    String s3="LLLLRRRR";

    @Test
    void balancedStringSplit1() {
        assertEquals(4, solution.balancedStringSplit(s1));
    }

    @Test
    void balancedStringSplit2() {
        assertEquals(2, solution.balancedStringSplit(s2));
    }

    @Test
    void balancedStringSplit3() {
        assertEquals(1, solution.balancedStringSplit(s3));
    }
}