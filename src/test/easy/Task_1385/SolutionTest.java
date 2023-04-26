package easy.Task_1385;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    int [] arr1_1 = {4,5,8};
    int [] arr2_1 = {10,9,1,8};
    int d_1= 2;

    int [] arr1_2 = {1,4,2,3};
    int [] arr2_2 = {-4,-3,6,10,20,30};
    int d_2= 3;

    int [] arr1_3 = {2,1,100,3};
    int [] arr2_3 = {-5,-2,10,-3,7};
    int d_3= 6;

    @Test
    void findTheDistanceValue1() {
        assertEquals(solution.findTheDistanceValue(arr1_1,arr2_1,d_1),2);
    }

    @Test
    void findTheDistanceValue2() {
        assertEquals(solution.findTheDistanceValue(arr1_2,arr2_2,d_2),2);
    }

    @Test
    void findTheDistanceValue3() {
        assertEquals(solution.findTheDistanceValue(arr1_3,arr2_3,d_3),1);
    }
}