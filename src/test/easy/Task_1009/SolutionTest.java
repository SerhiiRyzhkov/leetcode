package easy.Task_1009;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    int n1=5;

    int n2=7;

    int n3=10;

    @Test
    void bitwiseComplement1() {
        assertEquals(2,solution.bitwiseComplement(n1));
    }

    @Test
    void bitwiseComplement2() {
        assertEquals(0,solution.bitwiseComplement(n2));
    }

    @Test
    void bitwiseComplement3() {
        assertEquals(5,solution.bitwiseComplement(n3));
    }
}