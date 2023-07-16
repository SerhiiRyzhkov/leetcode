package easy.Task_836;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    int [] rec11 = {0,0,2,2};
    int [] rec21 = {1,1,3,3};

    int [] rec12 = {0,0,1,1};
    int [] rec22 = {1,0,2,1};

    int [] rec13 = {0,0,1,1};
    int [] rec23 = {2,2,3,3};

    @Test
    void isRectangleOverlap1() {
        assertTrue(solution.isRectangleOverlap(rec11,rec21));
    }

    @Test
    void isRectangleOverlap2() {
        assertFalse(solution.isRectangleOverlap(rec12,rec22));
    }

    @Test
    void isRectangleOverlap3() {
        assertFalse(solution.isRectangleOverlap(rec13,rec23));
    }
}