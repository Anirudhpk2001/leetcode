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

    int maxDiameter;
    private int longestpath(TreeNode root)
    {
        if(root == null)
        {
            return 0;
        }

        int left = longestpath(root.left);
        int right = longestpath(root.right);

        maxDiameter = Math.max(maxDiameter,left+right);

        return Math.max(left,right)+1;
    }
    public int diameterOfBinaryTree(TreeNode root) {
        if(root.left == null && root.right == null)
        {
            return 0;
        }
        maxDiameter = 0;
       longestpath(root);

       return maxDiameter;
    }
}