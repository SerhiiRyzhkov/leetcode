package easy.Task_1071;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    String str11 = "ABCABC";
    String str21 = "ABC";
    String result1 = "ABC";

    String str12 = "ABABAB";
    String str22 = "ABAB";
    String result2 = "AB";

    String str13 = "LEET";
    String str23 = "CODE";
    String result3 = "";


    @Test
    void gcdOfStrings1() {
    assertEquals(result1,solution.gcdOfStrings(str11,str21));
    }

    @Test
    void gcdOfStrings2() {
        assertEquals(result2,solution.gcdOfStrings(str12,str22));
    }

    @Test
    void gcdOfStrings3() {
        assertEquals(result3,solution.gcdOfStrings(str13,str23));
    }

}