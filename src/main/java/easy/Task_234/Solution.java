package easy.Task_234;

import java.util.ArrayList;
import java.util.List;

// Palindrome Linked List
// https://leetcode.com/problems/palindrome-linked-list/
public class Solution {
    public boolean isPalindrome(ListNode head) {
        List<Integer> list = new ArrayList<>();
        ListNode temp = head;
        while (temp != null) {
            list.add(temp.val);
            temp = temp.next;
        }
        int begin = 0;
        int end = list.size() - 1;


        while (end > begin)
            if (!list.get(begin++).equals(list.get(end--))) return false;

        return true;
    }
}