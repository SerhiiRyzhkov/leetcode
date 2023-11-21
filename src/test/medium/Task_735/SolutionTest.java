package medium.Task_735;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    int [] asteroids1 = {5,10,-5};
    int [] result1 = {5,10};
    int [] asteroids2 = {8,-8};
    int [] result2 = {};
    int [] asteroids3 = {10,2,-5};
    int [] result3 = {10};
    @Test
    void asteroidCollision1() {
        assertArrayEquals(result1, solution.asteroidCollision(asteroids1));
    }


    @Test
    void asteroidCollision2() {
        assertArrayEquals(result2, solution.asteroidCollision(asteroids2));
    }


    @Test
    void asteroidCollision3() {
        assertArrayEquals(result3, solution.asteroidCollision(asteroids3));
    }
}