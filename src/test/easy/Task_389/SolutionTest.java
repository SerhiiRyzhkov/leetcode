package easy.Task_389;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    String s1 = "abcd";
    String t1 = "abcde";


    String s2 = "";
    String t2 = "y";


    @Test
    void findTheDifference1() {
        assertEquals('e',solution.findTheDifference(s1,t1));
    }


    @Test
    void findTheDifference2() {
        assertEquals('y',solution.findTheDifference(s2,t2));
    }


}