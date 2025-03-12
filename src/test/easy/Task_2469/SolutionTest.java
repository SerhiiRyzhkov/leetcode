package easy.Task_2469;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    double celsius1 =36.50;
    double celsius2 =122.11;

    @Test
    void convertTemperature1() {
       assertArrayEquals(new double[]{309.65000,97.70000},solution.convertTemperature(celsius1));
    }

    @Test
    void convertTemperature2() {
        assertArrayEquals(new double[]{395.26000,251.79800},solution.convertTemperature(celsius2));
    }
}