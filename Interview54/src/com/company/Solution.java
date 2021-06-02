package com.company;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    int count;
    TreeNode Node;
    public int kthLargest(TreeNode root, int k) {
        dfs(root, k);
        return Node.val;
    }

    public void dfs(TreeNode root, int k){
        if (root == null) return;
        if (count == k) return;
        dfs(root.right, k);
        count++;
        if (count == k) Node = root;
        dfs(root.left, k);
    }
}