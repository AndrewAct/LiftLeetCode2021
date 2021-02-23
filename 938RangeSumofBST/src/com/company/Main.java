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
    private int sum = 0;

    public int rangeSumBST(TreeNode root, int low, int high) {
        if (root == null) return sum;
        calculator(root, low, high);
        return sum;
    }

    private void calculator(TreeNode root, int low, int high){
        if (root == null) return;;
        calculator(root.left, low, high);

        if (root.val >= low && root.val <= high) sum += root.val;

        calculator(root.right, low, high);
    }
}