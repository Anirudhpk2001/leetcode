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
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        Queue<TreeNode> q=new LinkedList<>();


        if(depth==1)
        {
            TreeNode one = new TreeNode(val);
            one.left=root;
            one.right=null;
            return one;
        }
        q.add(root);
        int presDepth=1;


        while(!q.isEmpty())
        {
            int size=q.size();

            for(int i=0;i<size;i++)
            {
                TreeNode currNode=q.poll();
                if(depth-1==presDepth)
                {
                    TreeNode left=currNode.left;
                    TreeNode right=currNode.right;

                    TreeNode nleft=new TreeNode(val);
                    TreeNode nright=new TreeNode(val);
                    nleft.left=left;
                    nright.right=right;

                    currNode.left=nleft;
                    currNode.right=nright;

                }
                else
                {
                    if(currNode.left!=null)
                    {
                        q.add(currNode.left);
                    }
                    
                     if(currNode.right!=null)
                    {
                        q.add(currNode.right);
                    }
                    
                   
                }
            }
            presDepth++;
        }



        return root;
    }
}


