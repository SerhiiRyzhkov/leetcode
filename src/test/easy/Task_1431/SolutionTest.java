package easy.Task_1431;


import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    int [] candies1 = {2,3,5,1,3};
    int extraCandies1 =3;
    List<Boolean>result1 = Arrays.asList(true,true,true,false,true);
    int [] candies2 = {4,2,1,1,2};
    int extraCandies2 =1;
    List<Boolean>result2 = Arrays.asList(true,false,false,false,false);

    int [] candies3 = {12,1,12};
    int extraCandies3 =10;
    List<Boolean>result3 = Arrays.asList(true,false,true);

    @Test
    void kidsWithCandies1() {
        assertEquals(solution.kidsWithCandies(candies1,extraCandies1),result1);
    }

    @Test
    void kidsWithCandies2() {
        assertEquals(solution.kidsWithCandies(candies2,extraCandies2),result2);
    }

    @Test
    void kidsWithCandies3() {
        assertEquals(solution.kidsWithCandies(candies3,extraCandies3),result3);
    }
}