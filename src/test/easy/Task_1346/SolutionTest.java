package easy.Task_1346;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    int [] arr1 = {10,2,5,3};


    int [] arr2 = {3,1,7,11};

    int [] arr3 = {-2,0,10,-19,4,6,-8};


    @Test
    void checkIfExist1() {
        assertTrue(solution.checkIfExist(arr1));
    }


    @Test
    void checkIfExist2() {
        assertFalse(solution.checkIfExist(arr2));
    }

    @Test
    void checkIfExist3() {
        assertFalse(solution.checkIfExist(arr3));
    }
}