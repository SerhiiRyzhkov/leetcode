package easy.Task_888;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();
    int [] aliceSizes1  = {1,1};
    int [] bobSizes1   = {2,2};

    int [] aliceSizes2  = {1,2};
    int [] bobSizes2   = {2,3};

    int [] aliceSizes3  = {2};
    int [] bobSizes3   = {1,3};

    @Test
    void fairCandySwap1() {
        assertArrayEquals(new int[]{1,2},solution.fairCandySwap(aliceSizes1,bobSizes1));
    }

    @Test
    void fairCandySwap2() {
        assertArrayEquals(new int[]{1,2},solution.fairCandySwap(aliceSizes2,bobSizes2));
    }

    @Test
    void fairCandySwap3() {
        assertArrayEquals(new int[]{2,3},solution.fairCandySwap(aliceSizes3,bobSizes3));
    }
}