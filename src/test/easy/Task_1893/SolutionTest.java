package easy.Task_1893;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    int [][] ranges1 = {{1,2},{3,4},{5,6}};
    int left1 = 2;
    int right1 = 5;

    int [][] ranges2 = {{1,10},{10,20}};
    int left2 = 21;
    int right2 = 21;

    @Test
    void isCovered1() {
        assertTrue(solution.isCovered(ranges1,left1,right1));
    }

    @Test
    void isCovered2() {
        assertFalse(solution.isCovered(ranges2,left2,right2));
    }
}