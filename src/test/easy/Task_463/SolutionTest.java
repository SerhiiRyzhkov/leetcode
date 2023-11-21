package easy.Task_463;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    int [][] grid1 = {{0,1,0,0},{1,1,1,0},{0,1,0,0},{1,1,0,0}};

    int [][] grid2 = {{1}};

    int [][] grid3 = {{1,0}};

    @Test
    void islandPerimeter1() {
        assertEquals(16,solution.islandPerimeter(grid1));
    }

    @Test
    void islandPerimeter2() {
        assertEquals(4,solution.islandPerimeter(grid2));
    }

    @Test
    void islandPerimeter3() {
        assertEquals(4,solution.islandPerimeter(grid3));
    }
}