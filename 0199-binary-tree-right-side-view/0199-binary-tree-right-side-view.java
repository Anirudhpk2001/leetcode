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
    public List<Integer> rightSideView(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        List<Integer> result=new ArrayList<>();
        if(root==null)
        {
            return result;
        }
        q.add(root);
        int s=0;
        result.add(root.val);
        while(q.size()!=0)
        {
           s =q.size();
            
            for(int i=0;i<s;i++)
            {
              TreeNode r=q.remove();
               if(r.right!=null){q.add(r.right);}
              if(r.left!=null){q.add(r.left);}
             
              
              
              
            }
            if(q.size()!=0)
            {
                result.add(q.peek().val);
            }
            

        }
        return result;
    }
}