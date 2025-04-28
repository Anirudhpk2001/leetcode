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
    List<List<Integer>> result;
    private void dfs(TreeNode root,int targetSum,List<Integer> temp,int sum)
    {
        if(root==null)
        {
            return;
        }

        sum+=root.val;
        temp.add(root.val);


        if(root.left==null && root.right==null)
        {
            if(sum==targetSum)
            {
                result.add(new ArrayList<>(temp));
            }   
        }
        else
        {
            
        dfs(root.left,targetSum,temp,sum);
        dfs(root.right,targetSum,temp,sum);
        }

        temp.remove(temp.size()-1);

    }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<Integer> temp=new ArrayList<>();
        result=new ArrayList<>();

        dfs(root,targetSum,temp,0);

        return result;
    }
}