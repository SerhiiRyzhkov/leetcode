package easy.Task_2586;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    String [] words1 = {"are","amy","u"};
    int left1 = 0;
    int right1 = 2;

    String [] words2= {"hey","aeo","mu","ooo","artro"};
    int left2= 1;
    int right2= 4;

    @Test
    void vowelStrings1() {
        assertEquals(2,solution.vowelStrings(words1,left1,right1));
    }

    @Test
    void vowelStrings2() {
        assertEquals(3,solution.vowelStrings(words2,left2,right2));
    }
}