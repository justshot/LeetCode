package com.jsl.easy.InvertBinaryTree;

import javax.lang.model.type.IntersectionType;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

/**
 * Created by shaoliang.
 */
public class InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {
        if(root==null){
            return null;
        }
        Queue<TreeNode> heap = new LinkedList<TreeNode>();
        heap.add(root);
        while(!heap.isEmpty()){
            TreeNode node = heap.poll();
            TreeNode temp = node.left;
            node.left = node.right;
            node.right = temp;
            if(node.left!=null){
                heap.add(node.left);
            }
            if(node.right!=null){
                heap.add(node.right);
            }
        }
        return root;
    }

    public void invertTreeByRecursive(TreeNode root){
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        if(root.left!=null) invertTreeByRecursive(root.left);
        if(root.right!=null) invertTreeByRecursive(root.right);
    }

    public void breadthFirstTransverseTree (TreeNode root){
        Queue<TreeNode> heap = new LinkedList<TreeNode>();
        heap.add(root);
        while(!heap.isEmpty()){
            TreeNode node = heap.poll();
            System.out.print(node.val);
            if(node.left!=null){
                heap.add(node.left);
            }
            if(node.right!=null){
                heap.add(node.right);
            }
        }
        System.out.print("\n");
    }

    public void depthFirstTransverseTree(TreeNode root){
        Stack<TreeNode> stack  = new Stack();
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode node = stack.pop();
            System.out.print(node.val);
            if(node.right!=null) stack.push(node.right);
            if(node.left!=null) stack.push(node.left);
        }
        System.out.println("");
    }

    public void recursiveTransverseTree(TreeNode root){
        System.out.print(root.val);
        if(root.left!=null){
            recursiveTransverseTree(root.left);
        }
        if(root.right!=null){
            recursiveTransverseTree(root.right);
        }
    }
    public static void main(String[] args){
        TreeNode root  = new TreeNode(4);
        TreeNode N11 =  new TreeNode(2);
        TreeNode N12 = new TreeNode(7);
        TreeNode N21 =  new TreeNode(1);
        TreeNode N22 = new TreeNode(3);
        TreeNode N23 =  new TreeNode(6);
        TreeNode N24 = new TreeNode(9);
        root.left = N11;root.right= N12;
        N11.left = N21; N11.right= N22;
        N12.left = N23; N12.right = N24;

        InvertBinaryTree invertBinaryTree  = new InvertBinaryTree();
        invertBinaryTree.breadthFirstTransverseTree(root);
        invertBinaryTree.depthFirstTransverseTree(root);
        invertBinaryTree.recursiveTransverseTree(root);
        System.out.println("");
        invertBinaryTree.invertTree(root);
        invertBinaryTree.breadthFirstTransverseTree(root);
        System.out.println("--invert tree by recursive--");
        invertBinaryTree.invertTreeByRecursive(root);
        invertBinaryTree.breadthFirstTransverseTree(root);
    }
}
