package easy.Task_1356;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    int [] arr1 = {0,1,2,3,4,5,6,7,8};
    int [] result1 = {0,1,2,4,8,3,5,6,7};

    int [] arr2 = {1024,512,256,128,64,32,16,8,4,2,1};
    int [] result2 = {1,2,4,8,16,32,64,128,256,512,1024};

    @Test
    void sortByBits1() {
    assertArrayEquals(result1,solution.sortByBits(arr1));
    }

    @Test
    void sortByBits2() {
        assertArrayEquals(result2,solution.sortByBits(arr2));
    }
}