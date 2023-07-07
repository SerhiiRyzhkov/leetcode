package easy.Task_2389;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();

    int [] nums1 = {4,5,2,1};
    int [] queries1 = {3,10,21};
    int [] answer1 = {2,3,4};

    int [] nums2 = {2,3,4,5};
    int [] queries2 = {1};
    int [] answer2 = {0};

    @Test
    void answerQueries1() {
        assertArrayEquals(answer1,solution.answerQueries(nums1,queries1));
    }

    @Test
    void answerQueries2() {
        assertArrayEquals(answer2,solution.answerQueries(nums2,queries2));
    }
}