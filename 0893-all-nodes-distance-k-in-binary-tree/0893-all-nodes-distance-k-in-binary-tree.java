/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    HashMap<TreeNode,TreeNode> Parent;
    HashSet<Integer> visited;

    private void populate(TreeNode root)
    {
        if(root==null)
        {
            return;
        }

        if(root.left!=null)
        {
            Parent.put(root.left,root);
        }

        populate(root.left);
        if(root.right!=null)
        {
            Parent.put(root.right,root);
        }

        populate(root.right);
    }
    Queue<TreeNode> queue;
    private void bfs(TreeNode target,int k)
    {
        if(target==null)
        {
            return;
        }
        queue.add(target);
        visited.add(target.val);

        while(!queue.isEmpty())
        {
            int size=queue.size();
            if(k==0)
            {
                break;
            }

            for(int i=0;i<size;i++)
            {
                TreeNode temp=queue.poll();
                if(temp.left!=null && !visited.contains(temp.left.val))
                {
                    queue.add(temp.left);
                    visited.add(temp.left.val);
                }
                if(temp.right!=null && !visited.contains(temp.right.val))
                {
                    queue.add(temp.right);
                    visited.add(temp.right.val);
                }
                if(Parent.containsKey(temp) && !visited.contains(Parent.get(temp).val))
                {
                    queue.add(Parent.get(temp));
                    visited.add(Parent.get(temp).val);
                }


            }
            k--;
        }
        return;

        
    }
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        Parent=new HashMap<>();
        visited=new HashSet<>();
        populate(root);
        queue=new LinkedList<>();
        bfs(target,k);
        

        List<Integer> res=new ArrayList<>();

        while(!queue.isEmpty())
        {
            res.add(queue.poll().val);
        }

        return res;
    }
}