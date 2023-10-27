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
    public int maxLevelSum(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
  
        if(root==null)
        {
            return 0;
        }
        q.add(root);
        int maxlevel=1;
        int count=1;
        int max=root.val;

        while(q.size()!=0)
        {   
            int sum=0;
            int s=q.size();
            for(int i=0;i<s;i++)
            {
                TreeNode r=q.remove();
                sum+=r.val;
                if(r.right!=null)
                {   
                  
                    q.add(r.right);
                }
                if(r.left!=null)
                {   
                   
                    q.add(r.left);
                }
            }
            
           if(sum>max)
           {
               max=sum;
               maxlevel=count;
           }
           count++;
        }

        return maxlevel;
    }
}