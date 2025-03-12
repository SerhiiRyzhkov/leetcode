package easy.Task_1200;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    int [] arr1 = {4,2,1,3};
    int [] arr2 = {1,3,6,10,15};
    int [] arr3 = {3,8,-10,23,19,-4,-14,27};
    @Test
    void minimumAbsDifference1() {
        assertEquals(Arrays.asList(
                Arrays.asList(1, 2),
                Arrays.asList(2, 3),
                Arrays.asList(3, 4)
        ), solution.minimumAbsDifference(arr1));
    }

    @Test
    void minimumAbsDifference2() {
        assertEquals(Arrays.asList(
                Arrays.asList(1,3)
        ), solution.minimumAbsDifference(arr2));
    }

    @Test
    void minimumAbsDifference3() {
        assertEquals(Arrays.asList(
                Arrays.asList(-14,-10),
                Arrays.asList(19,23),
                Arrays.asList(23,27)
        ), solution.minimumAbsDifference(arr3));
    }
}