package easy.Task_58;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();

    String s1= "Hello World";

    String s2= "   fly me   to   the moon  ";

    String s3= "luffy is still joyboy";

    @Test
    void lengthOfLastWord1() {
        assertEquals(solution.lengthOfLastWord(s1),5);
    }
    @Test
    void lengthOfLastWord2() {
        assertEquals(solution.lengthOfLastWord(s2),4);
    }
    @Test
    void lengthOfLastWord3() {
        assertEquals(solution.lengthOfLastWord(s3),6);
    }
}