package SymmetricTree101;

import java.util.Deque;
import java.util.LinkedList;

public class MyMain {

    public static void main(String[] args) {
        
    }
    public boolean isSymmetric(TreeNode root) {
        TreeNode p = root.left;
        TreeNode q = root.right;
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
            treeNodeDeque.add(q.right);
            treeNodeDeque.add(p.right);
            treeNodeDeque.add(q.left);
        }
        return true;
    }
}
