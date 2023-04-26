package easy.Task_1089;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    int [] arr1 = {1,0,2,3,0,4,5,0};
    int [] result1 = {1,0,0,2,3,0,0,4};

    int [] arr2 = {1,2,3};
    int [] result2 = {1,2,3};

    @Test
    void duplicateZeros1() {
        solution.duplicateZeros(arr1);
        assertArrayEquals(arr1,result1);
    }
    @Test
    void duplicateZeros2() {
        solution.duplicateZeros(arr2);
        assertArrayEquals(arr2,result2);
    }

}