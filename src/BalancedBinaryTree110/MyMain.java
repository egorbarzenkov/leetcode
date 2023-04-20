package BalancedBinaryTree110;


public class MyMain {
    public static void main(String[] args) {
        MyMain main = new MyMain();
        TreeNode node1 = new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7)));
        System.out.println(main.isBalanced(node1));
        TreeNode node2 = new TreeNode(1, new TreeNode(2, new TreeNode(3, new TreeNode(4), new TreeNode(4)), new TreeNode(3)), new TreeNode(2));
        System.out.println(main.isBalanced(node2));
//        [1,2,2,3,null,null,3,4,null,null,4]
        TreeNode node3 = new TreeNode(1, new TreeNode(2, new TreeNode(3, new TreeNode(4), null), null), new TreeNode(2, null, new TreeNode(3, null, new TreeNode(4))));
        System.out.println(main.isBalanced(node3));
    }

    public boolean isBalanced(TreeNode root) {
        if (root == null)
            return true;
        return isBalanced(root.left) && isBalanced(root.right) && Math.abs(depHelper(root.left) - depHelper(root.right)) <= 1;
    }

    private int depHelper(TreeNode node) {
        if (node == null)
            return 0;
        return 1 + Math.max(depHelper(node.left), depHelper(node.right));
    }
}
