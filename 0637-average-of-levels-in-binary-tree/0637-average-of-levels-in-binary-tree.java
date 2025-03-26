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
    public List<Double> averageOfLevels(TreeNode root) {
        List<TreeNode> temp=new ArrayList<>();

        List<Double> result=new ArrayList<>();

        Queue<TreeNode> q=new LinkedList<>();

        q.add(root);
        double res;

        while(!q.isEmpty())
        {
            res=0;
            while(!q.isEmpty())
            {
                temp.add(q.poll());
            }

            for(TreeNode t:temp)
            {
                res+=t.val;
                if(t.left!=null)
                {
                    q.add(t.left);
                }
                if(t.right!=null)
                {
                    q.add(t.right);
                }
            }

            result.add(res/temp.size());
            temp.clear();

        }

        return result;
        
    }
}