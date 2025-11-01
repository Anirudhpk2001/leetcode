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
    int totalSum;
    private void solve(TreeNode root,int sum)
    {
        if(root == null)
        {
            return;
        }

        if(root.left == null && root.right==null)
        {
            totalSum+=sum*10 + root.val;
        }

        sum = sum*10 + root.val;

        solve(root.left,sum);
        solve(root.right,sum);
    }
    public int sumNumbers(TreeNode root) {
        totalSum = 0;
        solve(root,0);

        return totalSum;
    }
}