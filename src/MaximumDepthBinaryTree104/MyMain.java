package MaximumDepthBinaryTree104;

public class MyMain {
    public static void main(String[] args) {
        MyMain main = new MyMain();
        TreeNode treeNode = new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7)));
        System.out.println(main.maxDepth(treeNode));
    }

    public int maxDepth(TreeNode root) {
        int depth = 0;
        if (root != null) {
            depth++;
        } else {
            return depth;
        }
        int leftDepth = depth;
        int rightDepth = depth;
        if (root.left != null) {
            leftDepth = helpDepth(root.left, leftDepth+1);
        }
        if (root.right != null) {
            rightDepth = helpDepth(root.right, rightDepth+1);
        }
        return Math.max(leftDepth, rightDepth);
    }

    private int helpDepth(TreeNode node, int depth) {
        int leftDepth = depth;
        int rightDepth = depth;
        if (node.left != null) {
            leftDepth = helpDepth(node.left, depth + 1);
        }
        if (node.right != null) {
            rightDepth = helpDepth(node.right, depth + 1);
        }
        return Math.max(leftDepth, rightDepth);
    }
}
