package MinimumDepthBinaryTree111;

public class MyMain {
    public static void main(String[] args) {
        MyMain main = new MyMain();
//        [2,null,3,null,4,null,5,null,6]
        System.out.println(main.minDepth(
                new TreeNode(2, null, new TreeNode(3, null, new TreeNode(4, null, new TreeNode(5, null, new TreeNode(6)))))
        ));
    }
    public int minDepth(TreeNode root) {
        if (root == null)
            return 0;
        if (root.left == null) {
            return 1 + minDepth(root.right);
        }
        if (root.right == null) {
            return 1 + minDepth(root.left);
        }
        return 1 + Math.min(minDepth(root.left), minDepth(root.right));
    }

//    private int minHelp(TreeNode node) {
//        if (node == null)
//            return 0;
//        return 1 + Math.min(minDepth(node.left), minDepth(node.right));
//    }
}
