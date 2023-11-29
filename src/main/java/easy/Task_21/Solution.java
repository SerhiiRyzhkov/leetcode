package easy.Task_21;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

// Merge Two Sorted Lists
// https://leetcode.com/problems/merge-two-sorted-lists/
public class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(Comparator.comparingInt(o -> o));

        ListNode temp = list1;
        while (temp!=null) {
            queue.add(temp.val);
            temp=temp.next;
        }

        temp=list2;
        while (temp!=null) {
            queue.add(temp.val);
            temp=temp.next;
        }


        ListNode result=queue.isEmpty()?null:new ListNode();

        temp = result;

        while (!queue.isEmpty()){
            temp.val=queue.remove();
            if(queue.isEmpty())break;
            temp.next=!queue.isEmpty()?new ListNode():null;
            temp=temp.next;
        }
        return result;
    }
}

