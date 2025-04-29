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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        boolean flag=false;

        List<List<Integer>> zigzag=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();

        if(root==null)
        {
            return zigzag;
        }


        q.add(root);

        while(!q.isEmpty())
        {
            int size=q.size();
            List<Integer> temp=new ArrayList<>();
            for(int i=0;i<size;i++)
            {
                TreeNode currNode=q.poll();
                temp.add(currNode.val);
                
                if(currNode.left!=null)
                {
                    q.add(currNode.left);
                }
                if(currNode.right!=null)
                {
                    q.add(currNode.right);
                }
                

                
            }

            if(flag==true)
            {
                Collections.reverse(temp);
            }
            flag=!flag;

            zigzag.add(temp);


        }


        return zigzag;
        
    }
}