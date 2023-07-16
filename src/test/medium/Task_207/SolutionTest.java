package medium.Task_207;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    int numCourses1 = 2;
    int [][] prerequisites1 = {{1,0}};

    int numCourses2 = 2;
    int [][] prerequisites2 = {{1,0},{0,1}};

    @Test
    void canFinish1() {
        assertTrue(solution.canFinish(numCourses1,prerequisites1));
    }
    @Test
    void canFinish2() {
        assertFalse(solution.canFinish(numCourses2,prerequisites2));
    }
}