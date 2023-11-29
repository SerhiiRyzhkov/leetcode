package medium.Task_777;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    String start1 = "RXXLRXRXL";
    String end1 = "XRLXXRRLX";

    String start2 = "X";
    String end2 = "L";

    String start3 = "LXXLXRLXXL";
    String end3 = "XLLXRXLXLX";


    @Test
    void canTransform1() {
        assertTrue(solution.canTransform(start1, end1));
    }


    @Test
    void canTransform2() {
        assertFalse(solution.canTransform(start2, end2));
    }

    @Test
    void canTransform3() {
        assertFalse(solution.canTransform(start3, end3));
    }

}