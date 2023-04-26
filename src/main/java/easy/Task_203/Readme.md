# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
We should iterate over the nodes, so it will be possible to do that using temporary node
# Approach
<!-- Describe your approach to solving the problem. -->
Firstly we need to handle special cases: 1) we get head=null, 2) we get list which completely filled by values from input params. Then we create temporary Node and link that to head Node and iterate over the list using temp Node and change the links when Node`s values are equals to value from input param.
# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
O(n)
- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```
class Solution {
    public ListNode removeElements(ListNode head, int val) {

        if(head==null)return null;


        while (head.val==val) {
          head=head.next;
          if(head==null)return null;
        }


        ListNode temp = head;

            while (temp.next!=null)
        {
            if(temp.next.val==val)temp.next=temp.next.next;
            if(temp.next==null)break;
            temp=temp.next;
            if (temp.val==val)temp=head;
        }

        return head;
    }
}

```