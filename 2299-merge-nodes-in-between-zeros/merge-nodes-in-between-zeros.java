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
    public ListNode mergeNodes(ListNode head) {
        ListNode a=null,b=null;
        int c=0;
        head=head.next;
        while(head.next!=null){
            if(head.val!=0)
            c+=head.val;
            else{
                if(a==null){
                    a=new ListNode(c,null);
                    b=a;
                }
                else{
                    while(b.next!=null)
                    b=b.next;
                    b.next=new ListNode(c,null);
                }
                c=0;
            }
            head=head.next;
        }
        if(a==null){
            a=new ListNode(c,null);
        }
        if(b!=null){
            while(b.next!=null)
            b=b.next;
            b.next=new ListNode(c);
            b.next.next=null;
        }
        return a;
    }
}