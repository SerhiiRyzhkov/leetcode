package easy.Task_1668;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();

    String sequence1="ababc";
    String word1 = "ab";

    String sequence2="ababc";
    String word2 = "ba";


    String sequence3="ababc";
    String word3 = "ac";



    @Test
    void maxRepeating1() {assertEquals(2,solution.maxRepeating(sequence1,word1)); }

    @Test
    void maxRepeating2() {assertEquals(1,solution.maxRepeating(sequence2,word2)); }

    @Test
    void maxRepeating3() {assertEquals(0,solution.maxRepeating(sequence3,word3)); }


}