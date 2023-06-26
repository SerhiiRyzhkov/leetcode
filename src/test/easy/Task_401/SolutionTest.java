package easy.Task_401;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    int turnedOn1 = 1;
    List<String>result1 = new ArrayList<>(Arrays.asList("0:01","0:02","0:04","0:08","0:16","0:32","1:00","2:00","4:00","8:00"));

    int turnedOn2 = 9;
    List<String>result2 = new ArrayList<>();



    @Test
    void readBinaryWatch1() {
        assertEquals(result1,solution.readBinaryWatch(turnedOn1));
    }

    @Test
    void readBinaryWatch2() {
        assertEquals(result2,solution.readBinaryWatch(turnedOn2));
    }

}