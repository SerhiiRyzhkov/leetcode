package easy.Task_2278;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    String s1="foobar";
    char letter1='o';


    String s2="jjjj";
    char letter2='k';


    @Test
    void percentageLetter1() {
        assertEquals(33,solution.percentageLetter(s1,letter1));
    }


    @Test
    void percentageLetter2() {
        assertEquals(0,solution.percentageLetter(s2,letter2));
    }
}