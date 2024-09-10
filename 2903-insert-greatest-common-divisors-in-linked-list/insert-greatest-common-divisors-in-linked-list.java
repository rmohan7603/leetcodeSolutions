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
    public int gcd(int a,int b){
        if(b!=0)
        return gcd(b,a%b);
        else
        return a;
    }
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode tempHead=head;
        while(tempHead.next!=null){
            int a=tempHead.val;
            int b=tempHead.next.val;
            int c=gcd(a,b);
            ListNode node=tempHead.next;
            tempHead.next=new ListNode(c,node);
            tempHead=tempHead.next.next;
        }
        return head;
    }
}