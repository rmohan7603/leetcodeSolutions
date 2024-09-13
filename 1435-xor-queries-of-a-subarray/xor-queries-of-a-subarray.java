class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int[] ansArr=new int[queries.length];
        for(int i=0;i<queries.length;i++){
            int ansXOR=0;
            for(int j=queries[i][0];j<=queries[i][1];j++)
            ansXOR^=arr[j];
            ansArr[i]=ansXOR;
        }
        return ansArr;
    }
}