package easy.Task_1304;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    int n1 = 5;

    int n2 = 3;

    int n3 = 73;

    @Test
    void sumZero1() {
        assertTrue(isZero(solution.sumZero(n1)));
    }

    @Test
    void sumZero2() {
        assertTrue(isZero(solution.sumZero(n2)));
    }

    @Test
    void sumZero3() {
        assertTrue(isZero(solution.sumZero(n3)));
    }




    boolean isZero(int [] a){
        return Arrays.stream(a).sum()==0;
    }
}