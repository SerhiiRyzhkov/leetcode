package easy.Task_9;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();

    int x1 = 121;

    int x2 = -121;

    int x3 = 10;

    @Test
    void isPalindrome1() {
        assertTrue(solution.isPalindrome(x1));
    }


    @Test
    void isPalindrome2() {
        assertFalse(solution.isPalindrome(x2));
    }


    @Test
    void isPalindrome3() {
        assertFalse(solution.isPalindrome(x3));
    }
}