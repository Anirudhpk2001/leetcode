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
    HashMap<Integer,Integer> map;
    private void dfs(TreeNode root,int depth)
    {
        if(root==null)
        {
            return;
        }
        if(!map.containsKey(depth))
        {
            map.put(depth,root.val);
        }
        else
        {
            map.put(depth,map.get(depth)+root.val);
        }

        

        dfs(root.left,depth+1);
        dfs(root.right,depth+1);
        
    }
    public int maxLevelSum(TreeNode root) {
        map=new HashMap<>();

        dfs(root,1);
        int max=Integer.MIN_VALUE;
        int max_level=1;

        for(Map.Entry<Integer,Integer> e:map.entrySet())
        {
            if(e.getValue()>max)
            {
                max=e.getValue();
                max_level=e.getKey();
            }
        }

        return max_level;

    }
}