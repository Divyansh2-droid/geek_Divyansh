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
    public int maxDepth(TreeNode root) {
        if(root==null) return 0;

        int leftdepth = maxDepth(root.left); //depth of leftside
        int rightdepth = maxDepth(root.right); //depth of rightside

        return 1 + Math.max(leftdepth, rightdepth); //max of left depth and right depth

    }
}