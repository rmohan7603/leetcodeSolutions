class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int[] prefixXOR=new int[arr.length+1];
        for(int i=0;i<arr.length;i++){
            prefixXOR[i+1]=arr[i]^prefixXOR[i];
        }
        System.out.println(Arrays.toString(prefixXOR));
        int[] ansArr=new int[queries.length];
        for(int i=0;i<queries.length;i++){
            ansArr[i]=prefixXOR[queries[i][1]+1]^prefixXOR[queries[i][0]];
        }
        return ansArr;
    }
}