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
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int[][] ansArr=new int[m][n];
        for(int i=0;i<m;i++)
        Arrays.fill(ansArr[i],-1);
        int top=0,bottom=m-1,left=0,right=n-1;
        while(top<=bottom && left<=right){
            for(int i=left;i<=right;i++){
                ansArr[top][i]=head.val;
                head=head.next;
                if(head==null)
                return ansArr;
            }
            top+=1;
            for(int i=top;i<=bottom;i++){
                ansArr[i][right]=head.val;
                head=head.next;
                if(head==null)
                return ansArr;
            }
            right-=1;
            if(top<=bottom){
                for(int i=right;i>=left;i--){
                    ansArr[bottom][i]=head.val;
                    head=head.next;
                    if(head==null)
                    return ansArr;
                }
            }
            bottom-=1;
            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    ansArr[i][left]=head.val;
                    head=head.next;
                    if(head==null)
                    return ansArr;
                }
                left+=1;
            }
        }
        return ansArr;
    }
}