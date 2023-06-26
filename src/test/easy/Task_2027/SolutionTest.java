package easy.Task_2027;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    String s1 = "XXX";

    String s2 = "XXOX";

    String s3 = "OOOO";

    @Test
    void minimumMoves1() {
        assertEquals(1,solution.minimumMoves(s1));
    }

    @Test
    void minimumMoves2() {
        assertEquals(2,solution.minimumMoves(s2));
    }

    @Test
    void minimumMoves3() {
        assertEquals(0,solution.minimumMoves(s3));
    }
}