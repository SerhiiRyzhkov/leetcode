package easy.Task_203;

//Remove Linked List Elements
//https://leetcode.com/problems/remove-linked-list-elements/
public class Solution {
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
