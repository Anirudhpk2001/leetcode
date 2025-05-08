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
    int count;
    private void dfs(TreeNode root,int[] freq)
    {
        if(root==null)
        {
            return;
        }
        freq[root.val]++;
        if(root.left==null && root.right==null)
        {
            if(isPalindrome(freq))
            {
                count++;
            }
        }

        dfs(root.left,freq);
        dfs(root.right,freq);

        freq[root.val]--;
    }

    private boolean isPalindrome(int[] freq)
    {
        int odd=0;
        for(int f:freq)
        {
            if(f%2==1)
            {
                odd++;
            }
        }
        if(odd>1)
        {
            return false;
        }
        return true;
    }
    public int pseudoPalindromicPaths (TreeNode root) {
        count=0;
        int[] freq=new int[10];

        dfs(root,freq);

        return count;
    }
}