package RemoveLinkedListElements203;

public class MyMain {

    //todo: не справился
    public static void main(String[] args) {
//        [1,2,6,3,4,5,6]
        ListNode node = new ListNode(1, new ListNode(2, new ListNode(6, new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6)))))));
        MyMain main = new MyMain();
        main.print(main.removeElements(node, 6));
        ListNode node1 = null;
        main.print(main.removeElements(node1, 1));
        ListNode node2 = new ListNode(7, new ListNode(7, new ListNode(7, new ListNode(7, new ListNode(7, new ListNode(7, new ListNode(7)))))));
        main.print(main.removeElements(node2, 7));
    }
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            return null;
        }

        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode cur = dummy;

        while (cur.next != null) {
            if (cur.next.val == val) {
                cur.next = cur.next.next;
                // Here cannot move cur to cur.next as we need to validate the next node.
            } else {
                cur = cur.next;
            }
        }

        return dummy.next;
    }

    private void print(ListNode node) {
        while (node!= null) {
            System.out.println(node.val);
            node = node.next;
        }
    }
}
