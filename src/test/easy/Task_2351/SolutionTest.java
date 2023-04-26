package easy.Task_2351;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    String s1 = "abccbaacz";
    String s2 = "abcdd";

    char result1 = 'c';
    char result2 = 'd';

    @Test
    void repeatedCharacter1() {
        assertEquals(solution.repeatedCharacter(s1),result1);
    }


    @Test
    void repeatedCharacter2() {
        assertEquals(solution.repeatedCharacter(s2),result2);
    }

}