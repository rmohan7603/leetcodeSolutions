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
class Solution {
    public ListNode modifiedList(int[] nums, ListNode head) {
        Set<Integer> remSet=new HashSet<>();
        for(int i:nums)
        remSet.add(i);
        while(remSet.contains(head.val))
        head=head.next;
        ListNode curNode=head;
        ListNode prevNode=head;
        while(curNode!=null){
            if(remSet.contains(curNode.val))
            prevNode.next=curNode.next;
            else
            prevNode=curNode;
            curNode=curNode.next;
        }
        return head;
    }
}