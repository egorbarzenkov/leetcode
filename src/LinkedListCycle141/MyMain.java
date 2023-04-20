package LinkedListCycle141;


import java.util.ArrayList;
import java.util.List;

public class MyMain {
    public static void main(String[] args) {

    }
    public boolean hasCycle(ListNode head) {
        if (head == null) {
            return false;
        }
        List<ListNode> nodeSet = new ArrayList<>();
        while (head.next != null && !nodeSet.contains(head.next)) {
            nodeSet.add(head);
            head = head.next;
        }
        if (head.next == null) {
            return false;
        } else {
            return true;
        }
    }
}
