package easy.Task_338;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    int n1 = 2;
    int [] ans1 = {0,1,1};

    int n2=5;
    int [] ans2 = {0,1,1,2,1,2};

    @Test
    void countBits1() {
        assertArrayEquals(ans1,solution.countBits(n1));
    }

    @Test
    void countBits2() {
        assertArrayEquals(ans2,solution.countBits(n2));
    }
}