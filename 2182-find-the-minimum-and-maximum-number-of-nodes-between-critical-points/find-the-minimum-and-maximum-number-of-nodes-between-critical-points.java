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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int c=0;
        List<Integer> y=new ArrayList<>();
        while(head.next!=null){
            c+=1;
            int prev=head.val;
            head=head.next;
            if(head.next==null)
            break;
            if(head.val>head.next.val && head.val>prev)
            y.add(c);
            if(head.val<head.next.val && head.val<prev)
            y.add(c);
        }
        /* List<Integer> x=new ArrayList<>();
        while(head!=null){
            x.add(head.val);
            head=head.next;
        }
        for(int i=1;i<x.size()-1;i++){
            if(x.get(i)<x.get(i+1) && x.get(i)<x.get(i-1))
            y.add(i);
            if(x.get(i)>x.get(i+1) && x.get(i)>x.get(i-1))
            y.add(i);
        }*/
        if(y.size()<2)
        return new int[]{-1,-1};
        int max=y.get(y.size()-1)-y.get(0);
        int min=y.get(1)-y.get(0);
        for(int i=1;i<y.size();i++)
        min=Math.min(min,y.get(i)-y.get(i-1));
        return new int[]{min,max};
    }
}