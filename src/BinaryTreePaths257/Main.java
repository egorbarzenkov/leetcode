package BinaryTreePaths257;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        main.binaryTreePaths(new TreeNode(1, new TreeNode(2, null, new TreeNode(5)), new TreeNode(3))).forEach(System.out::println);
    }
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res = new ArrayList<String>();
        if(root == null){
            return res;
        }
        StringBuilder sb = new StringBuilder();
        dfs(root, res, sb);
        return res;
    }

    private void dfs(TreeNode root, List<String> res, StringBuilder sb){
        if(root.left == null && root.right == null){
            sb.append(""+ root.val);
            res.add(sb.toString());
            return;
        }
        if(root.left != null){
            String prev = sb.toString();
            sb.append(root.val + "->");
            dfs(root.left, res, sb);
            sb = new StringBuilder(prev);
        }
        if(root.right != null){
            sb.append(root.val + "->");
            dfs(root.right, res, sb);
        }
    }
}
