package easy.Task_461;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    int x1=1;
    int y1=4;

    int x2=3;
    int y2=1;

    @Test
    void hammingDistance1() {
        assertEquals(2,solution.hammingDistance(x1,y1));
    }

    @Test
    void hammingDistance2() {
        assertEquals(1,solution.hammingDistance(x2,y2));
    }
}