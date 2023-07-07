package medium.Task_1882;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    int [] servers1 = {3,3,2};
    int [] tasks1 = {1,2,3,2,1,2};
    int [] answer1 = {2,2,0,2,1,2};

    int [] servers2 = {5,1,4,3,2};
    int [] tasks2 = {2,1,2,4,5,2,1};
    int [] answer2 = {1,4,1,4,1,3,2};


    @Test
    void assignTasks1() {
        assertArrayEquals(answer1, solution.assignTasks(servers1,tasks1));
    }

    @Test
    void assignTasks2() {
        assertArrayEquals(answer2, solution.assignTasks(servers2,tasks2));
    }

}