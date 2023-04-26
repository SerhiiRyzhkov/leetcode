package easy.Task_1796;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    String s1 = "dfa12321afd";

    String s2 = "abc1111";


    @Test
    void secondHighest1() {
        assertEquals(solution.secondHighest(s1),2);
    }
    @Test
    void secondHighest2() {
        assertEquals(solution.secondHighest(s2),-1);
    }
}