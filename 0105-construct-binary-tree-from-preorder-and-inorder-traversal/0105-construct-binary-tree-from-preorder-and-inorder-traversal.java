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

    int index;

    private TreeNode solve(int[] preorder, int[] inorder,int start, int end)
    {
        if(start>end)
        {
            return null;
        }

        if(index>=preorder.length)
        {
            return null;
        }

        int root = preorder[index];
        int j = 0;
        for(int i=0;i<inorder.length;i++)
        {
            if(inorder[i] == root)
            {
                j = i;
            }
        }


        TreeNode node = new TreeNode(root);
        index++;
        node.left = solve(preorder,inorder,start,j-1);
        node.right = solve(preorder,inorder,j+1,end);

        return node;
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        index = 0;
        return solve(preorder,inorder,0,preorder.length);
    }
}