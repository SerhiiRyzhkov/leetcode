package medium.Task_802;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    int [][] graph1 = {{1,2},{2,3},{5},{0},{5},{},{}};
    List<Integer> answer1 = new ArrayList<>(Arrays.asList(2,4,5,6));

    int [][] graph2 = {{1,2,3,4},{1,2},{3,4},{0,4},{}};
    List<Integer> answer2 = new ArrayList<>(List.of(4));

    @Test
    void eventualSafeNodes1() {
        assertEquals(answer1,solution.eventualSafeNodes(graph1));
    }

    @Test
    void eventualSafeNodes2() {
        assertEquals(answer2,solution.eventualSafeNodes(graph2));
    }
}