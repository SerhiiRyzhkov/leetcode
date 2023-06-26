package medium.Task_2606;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    String s1 = "adaa";
    String chars1 = "d";
    int [] vals1 = {-1000};

    String s2 = "abc";
    String chars2 = "abc";
    int [] vals2 = {-1,-1,-1};

    @Test
    void maximumCostSubstring1() {
        assertEquals(2,solution.maximumCostSubstring(s1,chars1,vals1));
    }

    @Test
    void maximumCostSubstring2() {
        assertEquals(0,solution.maximumCostSubstring(s2,chars2,vals2));
    }
}