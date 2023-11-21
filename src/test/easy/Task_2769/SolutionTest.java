package easy.Task_2769;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();

    int num1 = 4;
    int t1=1;

    int num2 = 3;
    int t2=2;

    @Test
    void theMaximumAchievableX1() {
        assertEquals(6,solution.theMaximumAchievableX(num1,t1));
    }

    @Test
    void theMaximumAchievableX2() {
        assertEquals(7,solution.theMaximumAchievableX(num2,t2));
    }
}