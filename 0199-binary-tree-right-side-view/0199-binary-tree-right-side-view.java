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
        List<Integer> result=new ArrayList<>();
        if(root==null)
        {
            return result;
        }

        Queue<TreeNode> bfsQueue=new LinkedList<>();

        bfsQueue.add(root);
        while(!bfsQueue.isEmpty())
        {

            int size=bfsQueue.size();

            for(int i=0;i<size;i++)
            {
                 TreeNode current=bfsQueue.poll();

                if(i==size-1)
                {
                   
                    result.add(current.val);
                
                }

                if(current.left!=null)
                {
                    bfsQueue.add(current.left);
                }
                if(current.right!=null)
                {
                    bfsQueue.add(current.right);
                }

            }


        }


        return result;

    }
}