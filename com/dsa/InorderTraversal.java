package com.dsa;
import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class InorderTraversal {

    public static void inorder(TreeNode root, List<Integer> result) {

        if (root == null) {
            return;
        }

        inorder(root.left, result);   // Left
        result.add(root.val);         // Root
        inorder(root.right, result);  // Right
    }

    public static void main(String[] args) {

        // create tree
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);

        List<Integer> result = new ArrayList<>();

        inorder(root, result);

        System.out.println(result); // [1, 3, 2]
    }
}