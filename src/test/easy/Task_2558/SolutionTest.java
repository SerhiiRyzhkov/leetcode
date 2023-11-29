package easy.Task_2558;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    int [] gifts1 = {25,64,9,4,100};
    int k1 = 4;


    int [] gifts2 = {1,1,1,1};
    int k2 = 4;

    @Test
    void pickGifts1() {
        assertEquals(29,solution.pickGifts(gifts1,k1));
    }

    @Test
    void pickGifts2() {
        assertEquals(4,solution.pickGifts(gifts2,k2));
    }
}