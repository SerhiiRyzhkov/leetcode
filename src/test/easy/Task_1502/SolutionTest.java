package easy.Task_1502;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    int [] arr1 = {3,5,1};

    int [] arr2 = {1,2,4};

    @Test
    void canMakeArithmeticProgression1() {
        assertTrue(solution.canMakeArithmeticProgression(arr1));
    }

    @Test
    void canMakeArithmeticProgression2() {
        assertFalse(solution.canMakeArithmeticProgression(arr2));
    }
}