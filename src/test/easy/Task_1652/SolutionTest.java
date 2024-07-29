package easy.Task_1652;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    int [] code1 = {5,7,1,4};
    int k1 = 3;

    int [] code2 = {1,2,3,4};
    int k2 = 0;

    int [] code3 = {2,4,9,3};
    int k3 = -2;


    @Test
    void decrypt1() {
        assertArrayEquals(new int[]{12, 10, 16, 13},solution.decrypt(code1,k1));
    }

    @Test
    void decrypt2() {
        assertArrayEquals(new int[]{0,0,0,0},solution.decrypt(code2,k2));
    }

    @Test
    void decrypt3() {
        assertArrayEquals(new int[]{12,5,6,13},solution.decrypt(code3,k3));
    }
}