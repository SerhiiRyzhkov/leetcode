package easy.Task_1619;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    int [] arr1 = {1,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,3};

    int [] arr2 = {6,2,7,5,1,2,0,3,10,2,5,0,5,5,0,8,7,6,8,0};

    int [] arr3 = {6,0,7,0,7,5,7,8,3,4,0,7,8,1,6,8,1,1,2,4,8,1,9,5,4,3,8,5,10,8,6,6,1,0,6,10,8,2,3,4};

    double tolerance = 1e-5;

    @Test
    void trimMean1() {
        assertEquals(2,solution.trimMean(arr1));
    }

    @Test
    void trimMean2() {
        assertEquals(4,solution.trimMean(arr2));
    }

    @Test
    void trimMean3() {
        assertTrue(assertAlmostEqual(4.77778,solution.trimMean(arr3)));
    }


    private  boolean assertAlmostEqual(double expected, double actual) {
                return
                Math.abs(expected - actual) <= this.tolerance;
    }
}