# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
We can use priority queue to keep elements sorted, or we can sort elements after all the elements get in a list
# Approach
<!-- Describe your approach to solving the problem. -->
We use priority queue, that keep elements sorted in native order. We iterate over both listNodes and put elements to the queue. Then we build a new listNode and with elements from the queue. Elements already were kept in necessary order.
# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
O(NlogN)
- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```
class Solution {
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
```