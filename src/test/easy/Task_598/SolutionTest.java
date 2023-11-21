package easy.Task_598;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    int m1=3;
    int n1=3;
    int [][] ops1 = {{2,2},{3,3}};


    int m2=3;
    int n2=3;
    int [][] ops2 = {{2,2},{3,3},{3,3},{3,3},{2,2},{3,3},{3,3},{3,3},{2,2},{3,3},{3,3},{3,3}};

    int m3=3;
    int n3=3;
    int [][] ops3 = {};


    @Test
    void maxCount1() {
        assertEquals(4,solution.maxCount(m1,n1,ops1));
    }

    @Test
    void maxCount2() {
        assertEquals(4,solution.maxCount(m2,n2,ops2));
    }

    @Test
    void maxCount3() {
        assertEquals(9,solution.maxCount(m3,n3,ops3));
    }
}