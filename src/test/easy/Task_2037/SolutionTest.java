package easy.Task_2037;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    int [] seats1 = {3,1,5};
    int [] students1 = {2,7,4};

    int [] seats2 = {4,1,5,9};
    int [] students2 = {1,3,2,6};

    int [] seats3 = {2,2,6,6};
    int [] students3 = {1,3,2,6};


    @Test
    void minMovesToSeat1() {
        assertEquals(solution.minMovesToSeat(seats1,students1),4);
    }

    @Test
    void minMovesToSeat2() {
        assertEquals(solution.minMovesToSeat(seats2,students2),7);
    }

    @Test
    void minMovesToSeat3() {
        assertEquals(solution.minMovesToSeat(seats3,students3),4);
    }
}