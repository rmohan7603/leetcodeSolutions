class Solution {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        int mp=0;
        for(int i=0;i<worker.length;i++){
            int p=0;
            for(int j=0;j<difficulty.length;j++){
                if(difficulty[j]<=worker[i] && profit[j]>p)
                p=profit[j];
            }
            mp+=p;
        }
        return mp;
    }
}