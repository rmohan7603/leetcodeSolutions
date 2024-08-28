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
    List<Integer> temp=new ArrayList<>();
    public void traverse(TreeNode root){
        if(root==null)
        return;
        traverse(root.left);
        temp.add(root.val);
        traverse(root.right);
    }
    public TreeNode increasingBST(TreeNode root) {
        traverse(root);
        TreeNode node=new TreeNode(temp.get(0));
        TreeNode ans=node;
        for(int i=1;i<temp.size();i++){
            node.right=new TreeNode(temp.get(i));
            node=node.right;
        }
        return ans;
    }
}