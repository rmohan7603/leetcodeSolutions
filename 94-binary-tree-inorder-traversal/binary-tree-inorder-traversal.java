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
    List<Integer> ansArr;
    public void inTraversal(TreeNode node){
        if(node==null)
        return;
        inTraversal(node.left);
        ansArr.add(node.val);
        inTraversal(node.right);
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        ansArr=new ArrayList<>();
        inTraversal(root);
        return ansArr;        
    }
}