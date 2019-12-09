package com.jsl.common;

import java.util.LinkedList;
import java.util.Queue;

public class TreeUtils {
    public static TreeNode fromArray(Integer[] tree) {
        if (tree.length == 0) return null;
        TreeNode root = new TreeNode(tree[0]);
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        for (int i = 1; i < tree.length; i++) {
            TreeNode node = q.peek();
            if (node.left == null) {
                node.left = tree[i] == null? null:new TreeNode(tree[i]);
                q.add(node.left);
            } else {
                node.right = new TreeNode(tree[i]);
                q.add(node.right);
                q.remove();
            }
        }
        return root;
    }
}
