package easy.Task_884;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();

    String s11 = "this apple is sweet";
    String s21 = "this apple is sour";
    String [] answer1 = {"sweet","sour"};


    String s12 = "apple apple";
    String s22 = "banana";
    String [] answer2 = {"banana"};

    String s13 = "s z z z s";
    String s23 = "s z ejt";
    String [] answer3 = {"ejt"};



    @Test
    void uncommonFromSentences1() {
        assertArrayEquals(answer1, solution.uncommonFromSentences(s11,s21) );
    }


    @Test
    void uncommonFromSentences2() {
        assertArrayEquals(answer2, solution.uncommonFromSentences(s12,s22) );
    }

    @Test
    void uncommonFromSentences3() {
        assertArrayEquals(answer3, solution.uncommonFromSentences(s13,s23) );
    }
}