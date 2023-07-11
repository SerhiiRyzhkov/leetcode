package easy.Task_1971;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    int n1=3;
    int [][] edges1 = {{0,1},{1,2},{2,0}};
    int sources1 =0;
    int destinations1 = 2;

    int n2=6;
    int [][] edges2 = {{0,1},{0,2},{3,5},{5,4},{4,3}};
    int sources2 =0;
    int destinations2 = 5;

    @Test
    void validPath1() {
        assertTrue(solution.validPath(n1,edges1,sources1,destinations1));
    }

    @Test
    void validPath2() {
        assertFalse(solution.validPath(n2,edges2,sources2,destinations2));
    }
}