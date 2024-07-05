package easy.Task_1791;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    int [][] edges1 = {{1,2},{2,3},{4,2}};
    int [][] edges2 = {{1,2},{5,1},{1,3},{1,4}};

    @Test
    void findCenter1() {
        assertEquals(2,solution.findCenter(edges1));
    }


    @Test
    void findCenter2() {
        assertEquals(1,solution.findCenter(edges2));
    }
}