package easy.Task_2937;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    String s11 = "abc"; String s21 = "abb"; String s31 = "ab";

    String s12 = "dac"; String s22 = "bac"; String s32 = "cac";

    @Test
    void findMinimumOperations1() {
        assertEquals(2,solution.findMinimumOperations(s11,s21,s31));
    }
    @Test
    void findMinimumOperations2() {
        assertEquals(-1,solution.findMinimumOperations(s12,s22,s32));
    }


}