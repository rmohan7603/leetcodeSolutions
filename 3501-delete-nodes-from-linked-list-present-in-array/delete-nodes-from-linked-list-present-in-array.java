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
/* class Solution {
    public ListNode modifiedList(int[] nums, ListNode head) {
        Set<Integer> remSet=new HashSet<>();
        for(int i:nums)
        remSet.add(i);
        while(remSet.contains(head.val))
        head=head.next;
        ListNode curNode=head;
        while(curNode.next!=null){
            if(remSet.contains(curNode.next.val))
            curNode.next=curNode.next.next;
            else
            curNode=curNode.next;
        }
        return head;
    }
} */
class Solution {
    public ListNode modifiedList(int[] nums, ListNode head) {
        int maxVal=0;
        for(int i:nums)
        maxVal=Math.max(maxVal,i);
        
        int[] setArr=new int[maxVal+1];
        for(int i:nums)
        setArr[i]=1;
        
        while(head.val<=maxVal && setArr[head.val]==1)
        head=head.next;
        
        ListNode curNode=head;
        while(curNode.next!=null){
            if(curNode.next.val<=maxVal && setArr[curNode.next.val]==1)
            curNode.next=curNode.next.next;
            else
            curNode=curNode.next;
        }
        return head;
    }
}