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
class Pair{
    TreeNode one;
    int two;

    Pair(TreeNode one,int two)
    {
        this.one=one;
        this.two=two;
    }
}
class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        ArrayDeque<Pair> queue=new ArrayDeque<>();

        Pair r=new Pair(root,0);
        queue.add(r);
        int max=0;
        while(!queue.isEmpty())
        {
            int size=queue.size();
            int L=queue.getFirst().two;
            int R=queue.getLast().two;
            max=Math.max(max,R-L+1);

            for(int i=0;i<size;i++)
            {
                Pair temp=queue.poll();
                int index=temp.two;
                if(temp.one.left!=null)
                {
                    Pair ntemp=new Pair(temp.one.left,(2*index)+1);
                    queue.add(ntemp);
                }
                if(temp.one.right!=null)
                {
                    Pair ntemp=new Pair(temp.one.right,(2*index)+2);
                    queue.add(ntemp);
                }
            }




        }


        return max;

    }
}