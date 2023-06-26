package medium.Task_763;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    String s1 = "ababcbacadefegdehijhklij";
    List<Integer>answer1 = new ArrayList<>(Arrays.asList(9,7,8));

    String s2 = "eccbbbbdec";
    List<Integer>answer2 = new ArrayList<>(List.of(10));

    @Test
    void partitionLabels1() {
        assertEquals(answer1,solution.partitionLabels(s1));
    }

    @Test
    void partitionLabels2() {
        assertEquals(answer2,solution.partitionLabels(s2));
    }
}