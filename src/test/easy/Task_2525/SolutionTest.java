package easy.Task_2525;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    int length1 = 1000;
    int width1  = 35;
    int height1  = 700;
    int mass1  = 300;

    int length2 = 200;
    int width2  = 50;
    int height2  = 800;
    int mass2  = 50;

    @Test
    void categorizeBox1() {
        assertEquals("Heavy",solution.categorizeBox(length1,width1,height1,mass1));
    }

    @Test
    void categorizeBox2() {
        assertEquals("Neither",solution.categorizeBox(length2,width2,height2,mass2));
    }
}