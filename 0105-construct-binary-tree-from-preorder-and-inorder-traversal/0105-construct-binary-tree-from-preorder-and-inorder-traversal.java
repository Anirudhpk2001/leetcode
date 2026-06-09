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
    HashMap<Integer,Integer> map = new HashMap<>();
    int index = 0;

    private TreeNode solve(int[] preorder, int[] inorder, int startIndex, int EndIndex)
    {
        if(startIndex > EndIndex)
        {
            return null;
        }
        // if(index>preorder.length-1)
        // {
        //     return null;
        // }
        int rootVal = preorder[index];
        index++;
        int rootPos = map.get(rootVal);
        TreeNode root = new TreeNode(rootVal);

        root.left = solve(preorder,inorder,startIndex,rootPos-1);
        root.right = solve(preorder,inorder,rootPos+1,EndIndex);


        return root;
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for(int i=0;i<inorder.length;i++)
        {
            map.put(inorder[i],i);
        }

        return solve(preorder,inorder,0,inorder.length-1);
    }
}