package easy.Task_2399;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    String s1 = "abaccb";
    int[] distance1 = {1,3,0,5,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};

    String s2 = "aa";
    int[] distance2 = {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};

    @Test
    void checkDistances1() {
        assertTrue(solution.checkDistances(s1,distance1));
    }

    @Test
    void checkDistances2() {
        assertFalse(solution.checkDistances(s2,distance2));
    }
}