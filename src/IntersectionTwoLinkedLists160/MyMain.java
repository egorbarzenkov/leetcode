package IntersectionTwoLinkedLists160;

import java.util.ArrayList;
import java.util.List;

public class MyMain {
    public static void main(String[] args) {
        MyMain main = new MyMain();
//        ListNode node = new ListNode(8,new ListNode(4, new ListNode(5)));
//        ListNode headA = new ListNode(4, new ListNode(1, node));
//        ListNode headB = new ListNode(5, new ListNode(6, new ListNode(1,  node)));
        ListNode node = new ListNode(1);
        System.out.println(main.getIntersectionNode(node, node).val);
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA== null || headB == null)
            return null;
        ListNode first = headA;
        ListNode second  = headB;
        List<ListNode> list = new ArrayList<>();
        while(second!=null){
            list.add(second);
            second= second.next;
        }
        while(first!=null){
            if(list.contains(first)){
                return first;
            }
            first = first.next;
        }
        return first;
    }

//    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
//        List<ListNode> headAList = new ArrayList<>();
//        while (headA != null) {
//            headAList.add(headA);
//            headA = headA.next;
//        }
//
//        List<ListNode> headBList = new ArrayList<>();
//        while (headB != null) {
//            headBList.add(headB);
//            headB = headB.next;
//        }
//        ListNode res = null;
//        for (int i = headAList.size() - 1, j = headBList.size() - 1; i >= 0 && j >= 0; i--, j--) {
//            if (headAList.get(i).equals(headBList.get(j))) {
//                res = headAList.get(i);
//            } else {
//                return res;
//            }
//        }
//        return res;
//    }
}
