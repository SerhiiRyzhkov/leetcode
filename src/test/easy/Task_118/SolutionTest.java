package easy.Task_118;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();

    int numRows1 =5;

    int numRows2=1;

    @Test
    void generate1() {
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(new ArrayList<>(List.of(1)));
        expected.add(new ArrayList<>(List.of(1,1)));
        expected.add(new ArrayList<>(List.of(1,2,1)));
        expected.add(new ArrayList<>(List.of(1,3,3,1)));
        expected.add(new ArrayList<>(List.of(1,4,6,4,1)));
        assertEquals(expected,solution.generate(numRows1));
    }

    @Test
    void generate2() {
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(new ArrayList<>(List.of(1)));
        assertEquals(expected,solution.generate(numRows2));
    }
}