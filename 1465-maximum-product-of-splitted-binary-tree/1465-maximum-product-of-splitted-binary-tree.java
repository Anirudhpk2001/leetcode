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
    long maxProduct;

    private int Max(TreeNode root)
    {
        if(root==null)
        {
            return 0;
        }
        return root.val+Max(root.left)+Max(root.right);

    }

    private long dfs(TreeNode root)
    {
        if(root==null)
        {
            return 0;
        }

        long left  = dfs(root.left);
        long right = dfs(root.right);
        long sum = root.val+left+right;
        long subtreesum = totalSum-sum;
        
 
        long product = (long) subtreesum * (totalSum - subtreesum);
        maxProduct = Math.max(maxProduct, product);
        return sum;
    }
    public int maxProduct(TreeNode root) {
        totalSum=Max(root);
   
        
         maxProduct=0;

        dfs(root);
        

        return (int)(maxProduct % 1_000_000_007);

    }
}