class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;
        Arrays.sort(nums);
        int lcs=0,lastsmaller=Integer.MIN_VALUE,curcout=0;
        for(int i:nums){
            if(i-1==lastsmaller){
                lastsmaller=i;
                curcout+=1;
            }
            else if(i!=lastsmaller){
                curcout=1;
                lastsmaller=i;
            }
            lcs=Math.max(lcs,curcout);
        }
        return lcs;
    }
}