package easy.Task_1629;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    int [] releaseTimes1  = {9,29,49,50};
    String keysPressed1 = "cbcd";

    int [] releaseTimes2  = {12,23,36,46,62};
    String keysPressed2 = "spuda";

    @Test
    void slowestKey1() {
        assertEquals('c',solution.slowestKey(releaseTimes1,keysPressed1));
    }

    @Test
    void slowestKey2() {
        assertEquals('a',solution.slowestKey(releaseTimes2,keysPressed2));
    }
}