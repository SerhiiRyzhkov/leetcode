package easy.Task_2600;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    int numOnes1 = 3;
    int numZeros1 = 2;
    int numNegOnes1 = 0;
    int k1 = 2;

    int numOnes2 = 3;
    int numZeros2 = 2;
    int numNegOnes2 = 0;
    int k2 = 4;

    @Test
    void kItemsWithMaximumSum1() {
    assertEquals(2,solution.kItemsWithMaximumSum(numOnes1,numZeros1,numNegOnes1,k1));
    }

    @Test
    void kItemsWithMaximumSum2() {
        assertEquals(3,solution.kItemsWithMaximumSum(numOnes2,numZeros2,numNegOnes2,k2));
    }
}