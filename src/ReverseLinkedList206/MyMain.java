package ReverseLinkedList206;

import java.util.ArrayList;
import java.util.List;

public class MyMain {
    public static void main(String[] args) {
        MyMain main = new MyMain();

        main.reverseList(new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5))))));
    }

    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;


        while(current != null) {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
}
