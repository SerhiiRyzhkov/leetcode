package leet206;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Reverse_Linked_List {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        reverseList(listNode);
    }

    public static ListNode reverseList(ListNode head) {

        if (head == null) return null;
        if (head.next == null) return head;
        List<ListNode> list = new LinkedList<>();

        ListNode temp = head;

        while (temp != null) {
            list.add(temp);
            temp = temp.next;
        }
        System.out.println(list.size());
        ListNode result = list.get(list.size() - 1);
        for (int i = list.size() - 1; i > 0; i--) {
            list.get(i).next = list.get(i - 1);

        }
        list.get(0).next = null;
        return result;
    }
}


class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    @Override
    public String toString() {
        return "ListNode{" +
                "val=" + val +
                '}';
    }
}