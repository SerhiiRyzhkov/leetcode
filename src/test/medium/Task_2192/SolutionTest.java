package medium.Task_2192;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    int n1=8;
    int[][] edges1 = {{0,3},{0,4},{1,3},{2,4},{2,7},{3,5},{3,6},{3,7},{4,6}};
    List<List<Integer>>answer1 = new ArrayList<>();

    int n2=5;
    int [][] edges2= {{0,1},{0,2},{0,3},{0,4},{1,2},{1,3},{1,4},{2,3},{2,4},{3,4}};
    List<List<Integer>>answer2 = new ArrayList<>();


    @Test
    void getAncestors1() {
        answer1.add(new ArrayList<>());
        answer1.add(new ArrayList<>());
        answer1.add(new ArrayList<>());
        answer1.add(new ArrayList<>(List.of(0,1)));
        answer1.add(new ArrayList<>(List.of(0,2)));
        answer1.add(new ArrayList<>(List.of(0,1,3)));
        answer1.add(new ArrayList<>(List.of(0,1,2,3,4)));
        answer1.add(new ArrayList<>(List.of(0,1,2,3)));
        assertEquals(answer1,solution.getAncestors(n1,edges1));
    }

    @Test
    void getAncestors2() {
        answer2.add(new ArrayList<>());
        answer2.add(new ArrayList<>(List.of(0)));
        answer2.add(new ArrayList<>(List.of(0,1)));
        answer2.add(new ArrayList<>(List.of(0,1,2)));
        answer2.add(new ArrayList<>(List.of(0,1,2,3)));
        assertEquals(answer2,solution.getAncestors(n2,edges2));
    }
}