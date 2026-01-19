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
    int max_dia ;
    private int longestDiameter(TreeNode root)
    {
        if(root == null)
        {
            return 0;
        }

        int left = longestDiameter(root.left);
        int right = longestDiameter(root.right);
        max_dia = Math.max(max_dia,left+right);

        return Math.max(left,right)+1;

    }
    public int diameterOfBinaryTree(TreeNode root) {
        max_dia = 0;
        if(root.left == null && root.right == null)
        {
            return 0;
        }

        longestDiameter(root);

        return max_dia;

    }
}