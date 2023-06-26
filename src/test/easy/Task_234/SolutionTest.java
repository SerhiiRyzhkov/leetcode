package easy.Task_234;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    ListNode listNode1 = new ListNode(1, new ListNode(2, new ListNode(2, new ListNode(1))));

    ListNode listNode2 = new ListNode(1, new ListNode(2));

    @Test
    void isPalindrome1() {
        assertTrue(solution.isPalindrome(listNode1));
    }

    @Test
    void isPalindrome2() {
        assertFalse(solution.isPalindrome(listNode2));
    }
}