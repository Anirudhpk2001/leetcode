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
    int count;

    private void bfs(TreeNode root)
    {
        if(root==null)
        {
            return;
        }

        int value=root.val;

        Queue<TreeNode> queue=new LinkedList<>();

        queue.add(root);
        int currcount=0;
        int sum=0;
        while(!queue.isEmpty())
        {
            TreeNode temp=queue.poll();
            sum+=temp.val;
            currcount++;
            if(temp.left!=null)
            {
                queue.add(temp.left);
            }
            if(temp.right!=null)
            {
                queue.add(temp.right);
            }
        }

        int avg=(int)Math.floor(sum/currcount);

        if(avg==value)
        {
            count++;
        }


    }

    private void dfs(TreeNode root)
    {
        if(root==null)
        {
            return;
        }

        bfs(root);
        dfs(root.left);
        dfs(root.right);
    }
    public int averageOfSubtree(TreeNode root) {
        count=0;

        dfs(root);
        return count;
    }
}