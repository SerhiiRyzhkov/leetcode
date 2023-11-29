package easy.Task_21;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    ListNode listNode11 = new ListNode(1, new ListNode(2, new ListNode(4)));
    ListNode listNode21 = new ListNode(1, new ListNode(3, new ListNode(4)));
    ListNode result1 = new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(4))))));


    ListNode listNode12 = new ListNode();
    ListNode listNode22 = new ListNode();
    ListNode result2 = new ListNode();

    ListNode listNode13 = new ListNode();
    ListNode listNode23 = new ListNode(0);
    ListNode result3 = new ListNode(0);

    @Test
    void mergeTwoLists1() {
        assertEquals(result1, solution.mergeTwoLists(listNode11,listNode21));
    }


    @Test
    void mergeTwoLists2() {
        assertEquals(result2, solution.mergeTwoLists(listNode12,listNode22));
    }


    @Test
    void mergeTwoLists3() {
        assertEquals(result3, solution.mergeTwoLists(listNode13,listNode23));
    }
}