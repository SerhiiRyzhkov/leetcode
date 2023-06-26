# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
Very comfortable to use List container to work with ListNode.
# Approach
<!-- Describe your approach to solving the problem. -->
We, using temp var, write all the nodes to list container. Then we check elements from begin and end of list while until we find elements that are not equal. If we found that we return false, else we return true.
# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
O(n)
- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
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
```