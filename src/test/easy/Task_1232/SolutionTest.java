package easy.Task_1232;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    int [][] coordinates1 = {{1,2},{2,3},{3,4},{4,5},{5,6},{6,7}};
    int [][] coordinates2 = {{1,1},{2,2},{3,4},{4,5},{5,6},{7,7}};
    int [][] coordinates3 = {{0,0},{0,1},{0,-1}};
    int [][] coordinates4 = {{0,0},{0,5},{5,5},{5,0}};

    int [][] coordinates5 = {{0,0},{0,5},{5,0},{1337,0},{0,1337}};


    @Test
    void checkStraightLine1() {
        assertTrue(solution.checkStraightLine(coordinates1));
    }

    @Test
    void checkStraightLine2() {
        assertFalse(solution.checkStraightLine(coordinates2));
    }

    @Test
    void checkStraightLine3() {
        assertTrue(solution.checkStraightLine(coordinates3));
    }

    @Test
    void checkStraightLine4() {
        assertFalse(solution.checkStraightLine(coordinates4));
    }

    @Test
    void checkStraightLine5() {
        assertFalse(solution.checkStraightLine(coordinates5));
    }
}