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
        int top=0,bottom=m-1,left=0,right=n-1;
        while(top<=bottom && left<=right){
            for(int i=left;i<=right;i++){
                if(head==null)
                ansArr[top][i]=-1;
                else{
                    ansArr[top][i]=head.val;
                    head=head.next;
                }
            }
            top+=1;
            for(int i=top;i<=bottom;i++){
                if(head==null)
                ansArr[i][right]=-1;
                else{
                    ansArr[i][right]=head.val;
                    head=head.next;
                }
            }
            right-=1;
            if(top<=bottom){
                for(int i=right;i>=left;i--){
                    if(head==null)
                    ansArr[bottom][i]=-1;
                    else{
                        ansArr[bottom][i]=head.val;
                        head=head.next;
                    }
                }
            }
            bottom-=1;
            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    if(head==null)
                    ansArr[i][left]=-1;
                    else{
                        ansArr[i][left]=head.val;
                        head=head.next;
                    }
                }
                left+=1;
            }
        }
        return ansArr;
    }
}