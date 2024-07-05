package easy.Task_2022;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    int [] original1 = {1,2,3,4};
    int m1 = 2;
    int n1 = 2;

    int [] original2 = {1,2,3};
    int m2 = 1;
    int n2 = 3;

    int [] original3 = {1,2};
    int m3 = 1;
    int n3 = 1;

    @Test
    void construct2DArray1() {
        assertArrayEquals( new int[][] {{1,2},{3,4}}, solution.construct2DArray(original1,m1,n1) );
    }

    @Test
    void construct2DArray2() {
        assertArrayEquals(new int[][] {{1,2,3}}, solution.construct2DArray(original2,m2,n2) );
    }

    @Test
    void construct2DArray3() {
        assertArrayEquals(new int[][] {}, solution.construct2DArray(original3,m3,n3) );
    }
}