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
    public void postOrder(TreeNode node, List<Integer> ansArr){
        if(node==null)
        return;
        postOrder(node.left,ansArr);
        postOrder(node.right,ansArr);
        ansArr.add(node.val);
    }
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> ansArr=new ArrayList<>();
        postOrder(root,ansArr);
        return ansArr;
    }
}