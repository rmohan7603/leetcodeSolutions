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
    public ListNode[] splitListToParts(ListNode head, int k) {
        int size=0;
        ListNode node=head;
        while(node!=null){
            size+=1;
            node=node.next;
        }
        int rem=size%k,grp=size/k;
        ListNode[] ansArr=new ListNode[k];
        if(grp==0){
            for(int i=0;i<rem;i++){
                ansArr[i]=new ListNode(head.val);
                head=head.next;
            }
            return ansArr;
        }
        for(int i=0;i<k;i++){
            node=null;
            ListNode temp=null;
            ListNode prev=null;
            for(int j=0;j<grp;j++){
                node=new ListNode(head.val);
                if(prev!=null)
                prev.next=node;
                prev=node;
                if(j==0)
                temp=node;
                head=head.next;
            }
            if(rem!=0){
                node=new ListNode(head.val);
                prev.next=node;
                prev=node;
                head=head.next;
                rem-=1;
            }
            ansArr[i]=temp;
        }
        return ansArr;
    }
}