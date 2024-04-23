package RemoveNthNodeFromEndList19;

public class MyMain {

    public static void main(String[] args) {
        MyMain main = new MyMain();
        main.removeNthFromEnd( new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5))))), 2);
    }

    int index ;
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null)
        {
            index =0;
            return null;
        }
        head.next = removeNthFromEnd(head.next,n);
        index++;
        if(n == index)
        {
            return head.next;
        }
        return head;
    }
}
