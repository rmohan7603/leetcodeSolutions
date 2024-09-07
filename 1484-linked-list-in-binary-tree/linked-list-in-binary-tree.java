/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
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
    public boolean found=false;
    public void traverse(TreeNode tnode, ListNode lnode){
        if(lnode==null){
            found=true;
            return;
        }
        if(tnode==null)
        return;
        if(tnode.val!=lnode.val){
            return; 
        }
        traverse(tnode.left,lnode.next);
        traverse(tnode.right,lnode.next);
    }
    public boolean isSubPath(ListNode head, TreeNode root) {
        if(root==null)
        return found;
        traverse(root,head);
        isSubPath(head,root.left);
        isSubPath(head,root.right);
        return found;
    }
}

/*
class Solution {
    public boolean traverse(TreeNode tnode, ListNode lnode){
        if(lnode==null)
        return true;
        if(tnode==null)
        return false;
        if(tnode.val!=lnode.val){
            return false; 
        }
        return traverse(tnode.left,lnode.next) || traverse(tnode.right,lnode.next);
    }
    public boolean isSubPath(ListNode head, TreeNode root) {
        if(root==null)
        return false;
        return (traverse(root,head) || isSubPath(head,root.left) || isSubPath(head,root.right));
    }
}
*/