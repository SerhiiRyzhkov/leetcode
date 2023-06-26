package easy.Task_1287;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    int [] arr1 = {1,2,2,6,6,6,6,7,10};

    int [] arr2 = {1,1};

    @Test
    void findSpecialInteger1() {
    assertEquals(6,solution.findSpecialInteger(arr1));
    }

    @Test
    void findSpecialInteger2() {
        assertEquals(1,solution.findSpecialInteger(arr2));
    }
}