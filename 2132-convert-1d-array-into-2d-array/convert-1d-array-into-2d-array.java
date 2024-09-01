class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        if(original.length!=m*n)
        return new int[0][0];
        int[][] ansArr=new int[m][n];
        int ptr1=0,ptr2=0;
        for(int i:original){
            ansArr[ptr1][ptr2++]=i;
            if(ptr2==n){
                ptr1+=1;
                ptr2=0;
            }
        }
        return ansArr;
    }
}