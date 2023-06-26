package easy.Task_1566;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();
    int [] arr1 = {1,2,4,4,4,4};
    int m1=1;
    int k1=3;

    int [] arr2 = {1,2,1,2,1,1,1,3};
    int m2=2;
    int k2=2;

    int [] arr3 = {1,2,1,2,1,3};
    int m3=2;
    int k3=3;





    @Test
    void containsPattern1() {
        assertTrue(solution.containsPattern(arr1,m1,k1));
    }

    @Test
    void containsPattern2() {
        assertTrue(solution.containsPattern(arr2,m2,k2));
    }

    @Test
    void containsPattern3() {
        assertFalse(solution.containsPattern(arr3,m3,k3));
    }



}