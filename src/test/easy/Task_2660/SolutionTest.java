package easy.Task_2660;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    int [] player11   = {4,10,7,9};
    int [] player21   = {6,5,2,3};

    int [] player12   = {3,5,7,6};
    int [] player22   = {8,10,10,2};

    int [] player13   = {2,3};
    int [] player23   = {4,1};

    @Test
    void isWinner1() {
        assertEquals(1,solution.isWinner(player11,player21));
    }

    @Test
    void isWinner2() {
        assertEquals(2,solution.isWinner(player12,player22));
    }

    @Test
    void isWinner3() {
        assertEquals(0,solution.isWinner(player13,player23));
    }
}