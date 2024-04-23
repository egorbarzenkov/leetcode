package DiameterofBinaryTree543;

import java.util.Stack;

public class MyMain {
    public static void main(String[] args) {
        MyMain main = new MyMain();
        System.out.println(main.diameterOfBinaryTree(new TreeNode()));
    }

    public int diameterOfBinaryTree(TreeNode root) {
        int res = 0;
        if (root == null || (root.left == null && root.right == null)) return res;
        Stack<TreeNode> nodeStack = new Stack<>();
        nodeStack.push(root);

        while (!nodeStack.isEmpty()) {
            TreeNode node = nodeStack.peek();
            if (node.left != null) {
                res = res + 1;
            }
            if (node.right != null) {
                res = res + 1;
            }
            nodeStack.push(node.left);
            nodeStack.push(node.right);
        }
        return res;
    }
}
