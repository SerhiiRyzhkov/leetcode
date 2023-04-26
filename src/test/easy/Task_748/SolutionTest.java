package easy.Task_748;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    String licensePlate1 = "1s3 PSt";
    String [] words1 = {"step","steps","stripe","stepple"};

    String licensePlate2 = "1s3 456";
    String [] words2 = {"looks","pest","stew","show"};




    @Test
    void shortestCompletingWord1() {
        assertEquals(solution.shortestCompletingWord(licensePlate1,words1),"steps");
    }

    @Test
    void shortestCompletingWord2() {
        assertEquals(solution.shortestCompletingWord(licensePlate2,words2),"pest");
    }
}