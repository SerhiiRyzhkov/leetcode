package easy.Task_1637;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    int [][]points1 = {{8,7},{9,9},{7,4},{9,7}};
    int [][]points2 = {{3,1},{9,0},{1,0},{1,4},{5,3},{8,8}};

    @Test
    void maxWidthOfVerticalArea1() {
        assertEquals(1,solution.maxWidthOfVerticalArea(points1));
    }


    @Test
    void maxWidthOfVerticalArea2() {
        assertEquals(3,solution.maxWidthOfVerticalArea(points2));
    }
}