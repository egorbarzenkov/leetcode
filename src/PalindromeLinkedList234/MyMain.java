package PalindromeLinkedList234;

public class MyMain {
    public static void main(String[] args) {
        MyMain main = new MyMain();
        System.out.println(main.isPalindrome(new ListNode(1, new ListNode(2, new ListNode(2, new ListNode(1))))));
        System.out.println(main.isPalindrome(new ListNode(1, new ListNode(2, new ListNode(2, new ListNode(1))))));
    }

    public boolean isPalindrome(ListNode head) {
        StringBuilder builder = new StringBuilder();
        while (head != null) {
            builder.append(head.val);
            head = head.next;
        }
        return builder.toString().equals(builder.reverse().toString());
    }
}
