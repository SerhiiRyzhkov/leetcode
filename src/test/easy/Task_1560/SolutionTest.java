package easy.Task_1560;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    int n1=4;
    int [] rounds1 = {1,3,1,2};
    List<Integer> result1 = new ArrayList<>(Arrays.asList(1,2));

    int n2=2;
    int [] rounds2 = {2,1,2,1,2,1,2,1,2};
    List<Integer> result2 = new ArrayList<>(Arrays.asList(2));

    int n3=7;
    int [] rounds3 = {1,3,5,7};
    List<Integer> result3 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7));

    @Test
    void mostVisited1() {
        assertEquals(result1,solution.mostVisited(n1,rounds1));
    }

    @Test
    void mostVisited2() {
        assertEquals(result2,solution.mostVisited(n2,rounds2));
    }

    @Test
    void mostVisited3() {
        assertEquals(result3,solution.mostVisited(n3,rounds3));
    }
}