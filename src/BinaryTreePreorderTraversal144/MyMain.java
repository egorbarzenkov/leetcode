package BinaryTreePreorderTraversal144;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class MyMain {
    public static void main(String[] args) {

    }

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> answer = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        stack.add(root);

        // Note that we add currNode's right child to the stack first.
        while (!stack.isEmpty()) {
            TreeNode currNode = stack.peek();
            stack.pop();
            if (currNode != null) {
                answer.add(currNode.val);
                stack.add(currNode.right);
                stack.add(currNode.left);
            }
        }

        return answer;
    }

//    public List<Integer> preorderTraversal(TreeNode root) {
//        List<Integer> result = new ArrayList<>();
//        if (root == null) {
//            return result;
//        }
//        result.add(root.val);
//        if (root.left!= null) {
//            preorderTraversalHelper(root.left, result);
//        }
//        if (root.right!= null) {
//            preorderTraversalHelper(root.right, result);
//        }
//        return result;
//    }
//
//    private List<Integer> preorderTraversalHelper(TreeNode node, List<Integer> result){
//        result.add(node.val);
//        if (node.left!= null) {
//            preorderTraversalHelper(node.left, result);
//        }
//        if (node.right!= null) {
//            preorderTraversalHelper(node.right, result);
//        }
//        return result;
//    }
}
