package easy.Task_1534;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();
    int [] arr1 = {3,0,1,1,9,7};
    int a1=7;
    int b1=2;
    int c1=3;

    int [] arr2 = {1,1,2,2,3};
    int a2=0;
    int b2=0;
    int c2=1;

    @Test
    void countGoodTriplets1() {
        assertEquals(4,solution.countGoodTriplets(arr1,a1,b1,c1));
    }

    @Test
    void countGoodTriplets2() {
        assertEquals(0,solution.countGoodTriplets(arr2,a2,b2,c2));
    }
}