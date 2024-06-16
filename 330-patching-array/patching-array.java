class Solution {
    public int minPatches(int[] nums, int n) {
        int pc=0,i=0;
        long mr=0;
        while(mr<n){
            if(i<nums.length && nums[i]<=mr+1){
                mr+=nums[i];
                i+=1;
            }
            else{
                mr=mr+mr+1;
                pc+=1;
            }
        }
        return pc;
    }
}