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

    private TreeNode dfs(TreeNode root, HashSet<Integer> set,List<TreeNode> result)
    {
        if(root==null)
        {
            return null;
        }
        root.left=dfs(root.left,set,result);
        root.right=dfs(root.right,set,result);

        if(set.contains(root.val))
        {
            if(root.left!=null)
            {
                result.add(root.left);
            }
            if(root.right!=null)
            {
                result.add(root.right);
            }

            return null;
        }
        else
        {
            return root;
        }

       

    }
    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        List<TreeNode> result=new ArrayList<>();

        HashSet<Integer> set=new HashSet<>();

        for(int d:to_delete)
        {
            set.add(d);
        }

        dfs(root,set,result);

        if(!set.contains(root.val))
        {
            result.add(root);
        }
        return result;
        
    }
}