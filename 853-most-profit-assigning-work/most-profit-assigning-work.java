class Solution {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        int md=0,mp=0;
        for(int i=0;i<difficulty.length;i++){
            if(difficulty[i]>md)
            md=difficulty[i];
        }
        int[] dp=new int[md+1];
        for(int i=0;i<difficulty.length;i++){
            dp[difficulty[i]]=Math.max(dp[difficulty[i]],profit[i]);
        }
        for(int i=1;i<=md;i++)
        dp[i]=Math.max(dp[i],dp[i-1]);
        for(int i=0;i<worker.length;i++){
            if(worker[i]>md)
            mp+=dp[md];
            else
            mp+=dp[worker[i]];
        }
        return mp;
    }
}