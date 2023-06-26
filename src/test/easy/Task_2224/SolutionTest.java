package easy.Task_2224;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();

    String current1 = "02:30";
    String correct1 = "04:35";

    String current2 = "11:00";
    String correct2 = "11:01";

    @Test
    void convertTime1() {
        assertEquals(3,solution.convertTime(current1,correct1));
    }


    @Test
    void convertTime2() {
        assertEquals(1,solution.convertTime(current2,correct2));
    }

}