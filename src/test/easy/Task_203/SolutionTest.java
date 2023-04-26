package easy.Task_203;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    ListNode listNode1 = new
            ListNode(1,new ListNode(2, new ListNode(6, new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6)))))));
    int val1 = 6;

    ListNode listNode2 = null;
    int val2 = 1;

    ListNode listNode3 = new ListNode(7,new ListNode(7, new ListNode(7, new ListNode(7, new ListNode(7)))));

    int val3 = 7;

    @Test
    void removeElements1() {
        ListNode answer = new ListNode(1,new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        assertEquals(solution.removeElements(listNode1,val1),answer);
    }

    @Test
    void removeElements2() {
        assertNull(solution.removeElements(listNode2,val2));
    }

    @Test
    void removeElements3() {
       assertNull(solution.removeElements(listNode3, val3));
    }

}