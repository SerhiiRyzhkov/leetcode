package easy.Task_1816;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    String s1 = "Hello how are you Contestant";
    int k1 = 4;

    String s2 = "What is the solution to this problem";
    int k2 = 4;

    String s3 = "chopper is not a tanuki";
    int k3 = 5;

    @Test
    void truncateSentence1() {
        assertEquals("Hello how are you",solution.truncateSentence(s1,k1));
    }

    @Test
    void truncateSentence2() {
        assertEquals("What is the solution",solution.truncateSentence(s2,k2));
    }

    @Test
    void truncateSentence3() {
        assertEquals("chopper is not a tanuki",solution.truncateSentence(s3,k3));
    }
}