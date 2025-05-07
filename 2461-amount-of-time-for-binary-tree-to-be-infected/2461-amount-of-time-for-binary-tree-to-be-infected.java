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
    HashSet<Integer> set;
    int count;

    private void dfs(int start,HashMap<Integer,List<Integer>> map,int depth)
    {
        if(set.contains(start))
        {
            return;
        }

        set.add(start);
        if(adj.containsKey(start))
        {
            for(int v:adj.get(start))
            {
                if(!set.contains(v))
                {
                    map.computeIfAbsent(depth,k -> new ArrayList<>()).add(v);
                    dfs(v,map,depth+1);
                }

            }
        }
        
    }
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

        count=0;
        set=new HashSet<>();
    
        HashMap<Integer,List<Integer>> map=new HashMap<>();
        dfs(start,map,0);
        count=map.size();
        return count;
    }
}