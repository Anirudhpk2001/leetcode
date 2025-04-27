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

    private void preorder(TreeNode root,List<Integer> result,int level)
    {
        if(root==null)
        {return;}

        if(level>result.size())
        {
            result.add(root.val);
        }

        preorder(root.right,result,level+1);
        preorder(root.left,result,level+1);
    }
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result=new ArrayList<>();
        if(root==null)
        {
            return result;
        }

        preorder(root,result,1);

        return result;
    }
}