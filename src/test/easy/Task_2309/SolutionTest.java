package easy.Task_2309;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    String s1 = "lEeTcOdE";

    String s2 = "arRAzFif";

    String s3 = "AbCdEfGhIjK";



    @Test
    void greatestLetter1() {
        assertEquals(solution.greatestLetter(s1),"E");
    }

    @Test
    void greatestLetter2() {
        assertEquals(solution.greatestLetter(s2),"R");
    }

    @Test
    void greatestLetter3() {
        assertEquals(solution.greatestLetter(s3),"");
    }
}