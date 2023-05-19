package easy.Task_2409;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    String arriveAlice1 = "08-15";
    String leaveAlice1  = "08-18";
    String arriveBob1  = "08-16";
    String leaveBob1  = "08-19";

    String arriveAlice2 = "10-01";
    String leaveAlice2  = "10-31";
    String arriveBob2  = "11-01";
    String leaveBob2  = "12-31";

    @Test
    void countDaysTogether1() {
        assertEquals(solution.countDaysTogether(arriveAlice1,leaveAlice1,arriveBob1,leaveBob1),3);
    }

    @Test
    void countDaysTogether2() {
        assertEquals(solution.countDaysTogether(arriveAlice2,leaveAlice2,arriveBob2,leaveBob2),0);
    }
}