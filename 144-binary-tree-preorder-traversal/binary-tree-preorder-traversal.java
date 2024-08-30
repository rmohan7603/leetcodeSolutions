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
    public void preTraversal(TreeNode node){
        if(node==null)
        return;
        ansArr.add(node.val);
        preTraversal(node.left);
        preTraversal(node.right);
    }
    public List<Integer> preorderTraversal(TreeNode root) {
        ansArr=new ArrayList<>();
        preTraversal(root);
        return ansArr;
    }
}