package RemoveDuplicatesSortedList83;

public class MyMain {
    public static void main(String[] args) {
        MyMain main = new MyMain();
        main.print(main.deleteDuplicates(new ListNode(1, new ListNode(1, new ListNode(2)))));
//        main.print(main.deleteDuplicates(createListNode(new int[] {1,1,2,3,3})));
//        main.print(main.deleteDuplicates());
    }

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode temp = head;
        while (temp.next != null) {
            if (temp.val == temp.next.val) {
                ListNode del = temp.next;
                temp.next = del.next;
            } else {
                temp = temp.next;
            }

        }
        return head;
    }

    private static ListNode createListNode(int[] ints) {
        ListNode head = new ListNode(ints[0]);
        ListNode body = head;
        for (int i = 1; i < ints.length; i++) {
            body.next = new ListNode(ints[i]);
            body = body.next;
        }
        return head;
    }

    private void print(ListNode deleteDuplicates) {
        while (deleteDuplicates.next != null) {
            System.out.println(deleteDuplicates.val);
            deleteDuplicates = deleteDuplicates.next;
        }
    }
}
