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
    HashMap<String,Integer> map;
    List<TreeNode> res;
    private String dfs(TreeNode root)
    {
        if(root==null)
        {
            return "#";
        }

        String left  = dfs(root.left);
        String right = dfs(root.right);

        String result = root.val +","+left+","+right;

        map.put(result,map.getOrDefault(result,0)+1);
        if(map.get(result)==2)
        {
            res.add(root);
        }

        return result;
    }
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        map=new HashMap<>();
        res=new ArrayList<>();
        dfs(root);

        return res;

    }
}