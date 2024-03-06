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
    ArrayList<Integer> answer=new ArrayList<>();
    public void inorder(TreeNode root,ArrayList<Integer> answer)
    {
        if(root==null)
        {
            return;
        }
        if(root.left!=null)
        {
        inorder(root.left,answer);
        }
        answer.add(root.val);
        if(root.right!=null)
        {
        inorder(root.right,answer);
        }

    }
    public List<Integer> inorderTraversal(TreeNode root) {
        inorder(root,answer);
        return answer;
    }
}