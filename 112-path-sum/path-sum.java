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
    boolean s=false;
    public void traversal(TreeNode node, int target){
        if(node==null)
        return;
        target-=node.val;
        if(node.left==null && node.right==null && target==0){
            s=true;
            return;
        }
        traversal(node.left,target);
        traversal(node.right,target);
    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        traversal(root,targetSum);
        if(s==true && root!=null)
        return true;
        return false;
    }
}