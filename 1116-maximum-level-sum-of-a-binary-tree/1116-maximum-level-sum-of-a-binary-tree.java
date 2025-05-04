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
        Queue<TreeNode> queue=new LinkedList<>();

        queue.add(root);

        int max=Integer.MIN_VALUE;
        int level=0;
        int max_level=1;

        while(!queue.isEmpty())
        {
            int size=queue.size();
            level++;
            int sum=0;

            for(int i=0;i<size;i++)
            {
                TreeNode temp=queue.poll();
                sum+=temp.val;
                if(temp.left!=null)
                {
                    queue.add(temp.left);
                }
                if(temp.right!=null)
                {
                    queue.add(temp.right);
                }
            }

            if(sum>max)
            {
                max=sum;
                max_level=level;
                
            }


        }


        return max_level;

    }
}