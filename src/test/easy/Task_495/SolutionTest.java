package easy.Task_495;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    int [] timeSeries1 = {1,4};
    int duration1 = 2;

    int [] timeSeries2 = {1,2};
    int duration2 = 2;


    @Test
    void findPoisonedDuration1() {
        assertEquals(4,solution.findPoisonedDuration(timeSeries1,duration1));
    }

    @Test
    void findPoisonedDuration2() {
        assertEquals(3,solution.findPoisonedDuration(timeSeries2,duration2));
    }
}