package easy.Task_925;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    String name1 = "alex";
    String typed1 = "aaleex";

    String name2 = "saeed";
    String typed2 = "ssaaedd";


    @Test
    void isLongPressedName1() {
        assertTrue(solution.isLongPressedName(name1,typed1));
    }

    @Test
    void isLongPressedName2() {
        assertFalse(solution.isLongPressedName(name2,typed2));
    }

}