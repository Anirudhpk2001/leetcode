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
    HashMap<Integer,List<Integer>> adj;
    public int amountOfTime(TreeNode root, int start) {
        adj=new HashMap<>();

        Queue<TreeNode> queue=new LinkedList<>();

        queue.add(root);

        while(!queue.isEmpty())
        {
            TreeNode temp=queue.poll();

            

            if(temp.left!=null)
            {
                adj.computeIfAbsent(temp.val,k->new ArrayList<>()).add(temp.left.val);
                adj.computeIfAbsent(temp.left.val,k->new ArrayList<>()).add(temp.val);
                queue.add(temp.left);
            }
            if(temp.right!=null)
            {
                adj.computeIfAbsent(temp.val,k->new ArrayList<>()).add(temp.right.val);
                adj.computeIfAbsent(temp.right.val,k->new ArrayList<>()).add(temp.val);
                queue.add(temp.right);
            }
        }


        Queue<Integer> q=new LinkedList<>();
        HashSet<Integer> set=new HashSet<>();
        q.add(start);
        int count=-1;
        set.add(start);

        while(!q.isEmpty())
        {
            int size=q.size();
            count++;
            // System.out.println
            for(int i=0;i<size;i++)
            {
                int u=q.poll();

                if(adj.containsKey(u))
                {
                    for(int v:adj.get(u))
                    {
                        if(!set.contains(v))
                        {
                            q.add(v);
                            set.add(v);
                        }

                    }
                }

            }
        }


        return count;
    }
}