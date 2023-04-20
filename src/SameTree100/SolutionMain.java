package SameTree100;

import java.util.Deque;
import java.util.LinkedList;

public class SolutionMain {
    public static void main(String[] args) {
        SolutionMain main = new SolutionMain();
        System.out.println(
                main.isSameTree(new TreeNode(1, null, new TreeNode(2, new TreeNode(3), null)),
                        new TreeNode(1, null, new TreeNode(2, new TreeNode(3), null)))
        );
    }
    public boolean isSameTree(TreeNode p, TreeNode q) {
        Deque<TreeNode> treeNodeDeque = new LinkedList<>();
        treeNodeDeque.add(p);
        treeNodeDeque.add(q);

        while (!treeNodeDeque.isEmpty()) {
            p = treeNodeDeque.poll();
            q = treeNodeDeque.poll();
            if (p == null && q == null) continue;
            if (p == null || q == null) return false;
            if (p.val != q.val) return false;

            treeNodeDeque.add(p.left);
            treeNodeDeque.add(q.left);
            treeNodeDeque.add(p.right);
            treeNodeDeque.add(q.right);
        }
        return true;
    }
}
