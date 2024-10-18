package CountCompleteTreeNodes222;

import java.util.Stack;

public class MyMain {

    public static void main(String[] args) {

    }

    Stack<TreeNode> treeNodes = new Stack<>();

    public int countNodes(TreeNode root) {
        int res = 0;
        if (root == null) {
            return res;
        }
        treeNodes.push(root);
        while (!treeNodes.isEmpty()) {
            TreeNode treeNode = treeNodes.pop();
            res++;
            if (treeNode.left != null)
                treeNodes.push(treeNode.left);
            if (treeNode.right != null)
                treeNodes.push(treeNode.right);
        }

        return res;
    }
}
