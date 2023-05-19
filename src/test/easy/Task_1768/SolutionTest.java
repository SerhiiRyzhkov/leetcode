package easy.Task_1768;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    String word1_1="abc";
    String word2_1="pqr";

    String word1_2="ab";
    String word2_2="pqrs";

    String word1_3="abcd";
    String word2_3="pq";

    @Test
    void mergeAlternately1() {
        assertEquals(solution.mergeAlternately(word1_1,word2_1),"apbqcr");
    }

    @Test
    void mergeAlternately2() {
        assertEquals(solution.mergeAlternately(word1_2,word2_2),"apbqrs");
    }

    @Test
    void mergeAlternately3() {
        assertEquals(solution.mergeAlternately(word1_3,word2_3),"apbqcd");
    }
}