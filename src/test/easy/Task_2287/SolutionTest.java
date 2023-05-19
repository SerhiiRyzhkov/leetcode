package easy.Task_2287;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    String s1="ilovecodingonleetcode";
    String target1="code";

    String s2="abcba";
    String target2="abc";

    String s3="abbaccaddaeea";
    String target3="aaaaa";


    @Test
    void rearrangeCharacters1() {
        assertEquals(solution.rearrangeCharacters(s1,target1),2);
    }

    @Test
    void rearrangeCharacters2() {
        assertEquals(solution.rearrangeCharacters(s2,target2),1);
    }

    @Test
    void rearrangeCharacters3() {
        assertEquals(solution.rearrangeCharacters(s3,target3),1);
    }


}