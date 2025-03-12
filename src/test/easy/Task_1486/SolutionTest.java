package easy.Task_1486;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();
    int n1=5;
    int start1 = 0;

    int n2=4;
    int start2 = 3;

    @Test
    void xorOperation1() {
        assertEquals(8,solution.xorOperation(n1,start1));
    }

    @Test
    void xorOperation2() {
        assertEquals(8,solution.xorOperation(n2,start2));
    }
}