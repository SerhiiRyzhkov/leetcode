package easy.Task_1078;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();

    String text1 = "alice is a good girl she is a good student";

    String first1 = "a";

    String second1 = "good";

    String [] result1 = {"girl","student"};


    String text2 = "we will we will rock you";

    String first2 = "we";

    String second2 = "will";

    String [] result2 = {"we","rock"};

    @Test
    void findOcurrences1() {
        assertArrayEquals(solution.findOcurrences(text1,first1,second1),result1);
    }


    @Test
    void findOcurrences2() {
        assertArrayEquals(solution.findOcurrences(text2,first2,second2),result2);
    }
}