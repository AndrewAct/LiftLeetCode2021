package com.company;

import javax.swing.tree.TreeNode;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int maxSize = 1;

    public int largestBSTSubtree(TreeNode root) {
        if(root == null) return 0;
        isBST(root);
        return maxSize;
    }

    // [BST size, min, max]
    private int[] isBST(TreeNode root) {
        if(root.left == null && root.right == null)
            return new int[]{1, root.val, root.val};

        int[] left = null, right = null;

        if(root.left != null)
            left = isBST(root.left);
        if(root.right != null)
            right = isBST(root.right);
        int size = 1, min = root.val, max = root.val;
        if(left != null) {
            if(left[0] != -1 && root.val > left[2]) {
                size += left[0];
                min = left[1];
            } else return new int[]{-1, 0, 0};
        }
        if(right != null) {
            if(right[0] != -1 && root.val < right[1]) {
                size += right[0];
                max = right[2];
            } else return new int[]{-1, 0, 0};
        }
        maxSize = Math.max(maxSize, size);
        return new int[]{size, min, max};
    }
}