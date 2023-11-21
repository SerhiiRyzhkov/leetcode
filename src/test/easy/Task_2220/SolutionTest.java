package easy.Task_2220;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();

    int start1 =10;
    int goal1 = 7;

    int start2 =3;
    int goal2 = 4;

    @Test
    void minBitFlips1() {
        assertEquals(3,solution.minBitFlips(start1,goal1));
    }

    @Test
    void minBitFlips2() {
        assertEquals(3,solution.minBitFlips(start2,goal2));
    }
}