package easy.Task_2798;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    int [] hours1 = {0,1,2,3,4};
    int target1 = 2;

    int [] hours2 = {5,1,4,2,2};
    int target2=6;


    @Test
    void numberOfEmployeesWhoMetTarget1() {
        assertEquals(3,solution.numberOfEmployeesWhoMetTarget(hours1,target1));
    }

    @Test
    void numberOfEmployeesWhoMetTarget2() {
        assertEquals(0,solution.numberOfEmployeesWhoMetTarget(hours2,target2));
    }
}