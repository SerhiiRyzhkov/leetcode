package easy.Task_2094;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    int [] digits1 = {2,1,3,0};
    int [] result1 = {102,120,130,132,210,230,302,310,312,320};

    int [] digits2 = {2,2,8,8,2};
    int [] result2 = {222,228,282,288,822,828,882};

    int [] digits3 = {3,7,5};
    int [] result3 = {};

    @Test
    void findEvenNumbers1() {
        assertArrayEquals(result1,solution.findEvenNumbers(digits1));
    }

    @Test
    void findEvenNumbers2() {
        assertArrayEquals(result2,solution.findEvenNumbers(digits2));
    }

    @Test
    void findEvenNumbers3() {
        assertArrayEquals(result3,solution.findEvenNumbers(digits3));
    }
}