package com.jsl.common;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TreeUtilsTest {
    @Test
    public void testFullBinaryTree(){
        Integer[] treeArray = new Integer[] {1, 2, 3, 4, 5, 6, 7};
        TreeNode root = TreeUtils.fromArray(treeArray);
        assertEquals(1, root.val);
        assertEquals(7, root.right.right.val);
    }

    @Test
    public void testCompleteBinaryTree(){
        Integer[] treeArray = new Integer[] {1, 2, 3, 4, 5, 6};
        TreeNode root = TreeUtils.fromArray(treeArray);
        assertEquals(1, root.val);
        assertEquals(6, root.right.left.val);
    }

    @Test
    public void testNormalBinaryTree(){
        Integer[] treeArray = new Integer[] {1, 2, 3, 4, 5, null, 7};
        TreeNode root = TreeUtils.fromArray(treeArray);
        assertEquals(1, root.val);
        assertEquals(6, root.right.right.val);
    }
}