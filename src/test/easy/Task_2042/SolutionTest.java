package easy.Task_2042;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    String s1 = "1 box has 3 blue 4 red 6 green and 12 yellow marbles";
    String s2 = "hello world 5 x 5";
    String s3 = "sunset is at 7 51 pm overnight lows will be in the low 50 and 60 s";

    @Test
    void areNumbersAscending1() {
        assertEquals(solution.areNumbersAscending(s1),true);
    }
    @Test
    void areNumbersAscending2() {
        assertEquals(solution.areNumbersAscending(s2),false);
    }
    @Test
    void areNumbersAscending3() {
        assertEquals(solution.areNumbersAscending(s3),false);
    }
}