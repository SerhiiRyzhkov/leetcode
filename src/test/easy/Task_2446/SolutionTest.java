package easy.Task_2446;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    String[] event11 = {"01:15","02:00"};
    String [] event21 = {"02:00","03:00"};

    String[] event12 = {"01:00","02:00"};
    String [] event22 = {"01:20","03:00"};

    String[] event13 = {"10:00","11:00"};
    String [] event23 = {"14:00","15:00"};

    @Test
    void haveConflict1() {
        assertTrue(solution.haveConflict(event11,event21));
    }

    @Test
    void haveConflict2() {
        assertTrue(solution.haveConflict(event12,event22));
    }

    @Test
    void haveConflict3() {
        assertFalse(solution.haveConflict(event13,event23));
    }
}