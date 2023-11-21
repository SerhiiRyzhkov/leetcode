package easy.Task_605;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    int [] flowerbed1  = {1,0,0,0,1};
    int n1=1;

    int [] flowerbed2  = {1,0,0,0,1};
    int n2=2;

    @Test
    void canPlaceFlowers1() {
        assertTrue(solution.canPlaceFlowers(flowerbed1,n1));
    }

    @Test
    void canPlaceFlowers2(){
        assertFalse(solution.canPlaceFlowers(flowerbed2,n2));
    }
}