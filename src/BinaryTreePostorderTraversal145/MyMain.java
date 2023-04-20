package BinaryTreePostorderTraversal145;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class MyMain {
    static List<Integer> result;

    private static void traversePostOrder(TreeNode node) {
        if (node == null) return;
        if (node.left != null) {
            traversePostOrder(node.left);
        }
        if (node.right != null) {
            traversePostOrder(node.right);
        }
        result.add(node.val);
    }

    public List<Integer> postorderTraversal(TreeNode root) {
        result = new ArrayList<>();
        traversePostOrder(root);
        return result;
    }
//    public List<Integer> postorderTraversal(TreeNode root) {
//        LinkedList<Integer> result = new LinkedList<>();
//        if (root == null)
//            return result;
//        Stack<TreeNode> stack = new Stack<>();
//        stack.push(root);
//        while (!stack.isEmpty()) {
//            TreeNode node = stack.pop();
//            result.addFirst(node.val);
//            if (node.left != null)
//                stack.push(node.left);
//            if (node.right != null)
//                stack.push(node.right);
//        }
//        return result;
//    }
}
