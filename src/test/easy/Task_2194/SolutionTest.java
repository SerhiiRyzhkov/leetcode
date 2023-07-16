package easy.Task_2194;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    String s1 = "K1:L2";
    List<String> result1 = new ArrayList<>(Arrays.asList("K1","K2","L1","L2"));

    String s2 = "A1:F1";
    List<String> result2 = new ArrayList<>(Arrays.asList("A1","B1","C1","D1","E1","F1"));

    @Test
    void cellsInRange1() {
        assertEquals(result1,solution.cellsInRange(s1));
    }

    @Test
    void cellsInRange2() {
        assertEquals(result2,solution.cellsInRange(s2));
    }
}