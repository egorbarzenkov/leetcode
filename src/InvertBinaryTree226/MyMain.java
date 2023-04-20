package InvertBinaryTree226;

import java.util.Stack;

public class MyMain {
    public static void main(String[] args) {
        MyMain main = new MyMain();
//        [4,2,7,1,3,6,9]
        main.invertTree(new TreeNode(4, new TreeNode(2, new TreeNode(1), new TreeNode(3)), new TreeNode(7, new TreeNode(6), new TreeNode(9))));
    }

    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return root;
        }
        Stack<TreeNode> treeNodes = new Stack<>();
        treeNodes.push(root);

        while (!treeNodes.isEmpty()) {
            TreeNode node = treeNodes.pop();
            if (node == null) {
                continue;
            }
            TreeNode temp = node.left;
            node.left = node.right;
            node.right = temp;
            treeNodes.push(node.left);
            treeNodes.push(node.right);
        }
        return root;
    }

//    public TreeNode invertTree(TreeNode root) {
//        if (root == null) {
//            return root;
//        }
//        TreeNode temp = root.left;
//        root.left = root.right;
//        root.right = temp;
//        invertTree(root.left);
//        invertTree(root.right);
//        return root;
//    }
}
