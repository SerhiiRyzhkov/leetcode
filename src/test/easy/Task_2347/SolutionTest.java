package easy.Task_2347;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    int [] ranks1 = {13,2,3,1,9};
    char[] suits1 = {'a','a','a','a','a'};

    int [] ranks2 = {4,4,2,4,4};
    char[] suits2 = {'d','a','a','b','c'};

    int [] ranks3 = {10,10,2,12,9};
    char[] suits3 = {'a','b','c','a','d'};

    @Test
    void bestHand1() {
        assertEquals("Flush",solution.bestHand(ranks1,suits1));
    }

    @Test
    void bestHand2() {
        assertEquals("Three of a Kind",solution.bestHand(ranks2,suits2));
    }

    @Test
    void bestHand3() {
        assertEquals("Pair",solution.bestHand(ranks3,suits3));
    }
}