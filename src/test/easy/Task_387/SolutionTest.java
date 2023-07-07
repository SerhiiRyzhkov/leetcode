package easy.Task_387;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    String s1 = "leetcode";

    String s2 = "loveleetcode";

    String s3 = "aabb";

    @Test
    void firstUniqChar1() {
        assertEquals(0,solution.firstUniqChar(s1));
    }

    @Test
    void firstUniqChar2() {
        assertEquals(2,solution.firstUniqChar(s2));
    }

    @Test
    void firstUniqChar3() {
        assertEquals(-1,solution.firstUniqChar(s3));
    }
}