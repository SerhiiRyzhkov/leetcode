package medium.Task_2079;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    int [] plants1 = {2,2,3,3};
    int capacity1 = 5;

    int [] plants2 = {1,1,1,4,2,3};
    int capacity2 = 4;

    int [] plants3 = {7,7,7,7,7,7,7};
    int capacity3 = 8;

    @Test
    void wateringPlants1() {
        assertEquals(14,solution.wateringPlants(plants1,capacity1));
    }

    @Test
    void wateringPlants2() {
        assertEquals(30,solution.wateringPlants(plants2,capacity2));
    }

    @Test
    void wateringPlants3() {
        assertEquals(49,solution.wateringPlants(plants3,capacity3));
    }

}