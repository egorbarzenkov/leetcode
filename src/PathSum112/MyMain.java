package PathSum112;

public class MyMain {
    public static void main(String[] args) {
        MyMain main = new MyMain();
//        [5,4,8,11,null,13,4,7,2,null,null,null,1]
        TreeNode node = new TreeNode(5, new TreeNode(4, new TreeNode(11, new TreeNode(7), new TreeNode(2)), null),
                new TreeNode(8, new TreeNode(13), new TreeNode(4, null, new TreeNode(1))));
        System.out.println(main.hasPathSum(node, 22));

        TreeNode node1 = new TreeNode(1, new TreeNode(2), null);
        System.out.println(main.hasPathSum(node1, 1));
    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null)
            return false;
        return hasPathSumHelper(root, targetSum);
    }

    private boolean hasPathSumHelper(TreeNode root, int targetSum) {
        if (root == null && targetSum != 0)
            return false;
        targetSum -= root.val;
        if (root.left == null && root.right == null && targetSum == 0)
            return true;
        else if ((root.left == null || root.right == null) && targetSum == 0)
            return false;
        return hasPathSumHelper(root.left, targetSum) || hasPathSumHelper(root.right, targetSum);
    }
}
