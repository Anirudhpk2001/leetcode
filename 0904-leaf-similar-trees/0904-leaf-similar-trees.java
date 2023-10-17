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
    public ArrayList<Integer> check1(TreeNode root1,ArrayList<Integer> a1)
    {   if(root1==null)
        {
            return null;
        }
        if(root1.left==null && root1.right==null){
            a1.add(root1.val);
            return a1;
        }
        check1(root1.left,a1);
        check1(root1.right,a1);
        return a1;
    }
    public ArrayList<Integer> check2(TreeNode root2,ArrayList<Integer> a2)
    {   if(root2==null)
        {
            return null;
        }
        
        if(root2.left==null && root2.right==null){
            a2.add(root2.val);
            return a2;
        }
        check2(root2.left,a2);
        check2(root2.right,a2);
        return a2;
    }
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        
        
        ArrayList<Integer> a1=new ArrayList<>();
        ArrayList<Integer> a2=new ArrayList<>();
        check1(root1,a1);
        check2(root2,a2);

        return  a1.equals(a2) ;


    }
}