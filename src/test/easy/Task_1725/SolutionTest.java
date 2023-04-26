package easy.Task_1725;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();

    int [][] rectangles1 = {{5,8},{3,9},{5,12},{16,5}};

    int [][] rectangles2 = {{2,3},{3,7},{4,3},{3,7}};

    @Test
    void countGoodRectangles1() {
        assertEquals(solution.countGoodRectangles(rectangles1),3);
    }

    @Test
    void countGoodRectangles2() {
        assertEquals(solution.countGoodRectangles(rectangles2),3);
    }
}