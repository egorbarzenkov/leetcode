package SwapNodesInPairs24;

public class MyMain {
    public static void main(String[] args) {
        MyMain main = new MyMain();
        main.swapPairs(new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4)))));
    }

    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode temp = head;
        ListNode ans = head.next;
        ListNode prev = temp;
        while (temp != null && temp.next != null) {

            ListNode next_head = temp.next.next;
            if (temp != head) {
                prev.next = temp.next;
                prev = temp;
            }

            temp.next.next = temp;
            temp.next = next_head;

            temp = next_head;

        }
        return ans;
    }

//    public ListNode swapPairs(ListNode head) {
//        ListNode t=head;
//        if(head==null || head.next==null)
//            return head;
//        ListNode n=head.next;
//        while(n!=null)
//        {
//            int a=t.val;
//            int p=n.val;
//            t.val=p;
//            n.val=a;
//            t=t.next.next;
//            if(n.next==null || n==null)
//                break;
//            n=n.next.next;
//        }
//        return head;
//    }
}
