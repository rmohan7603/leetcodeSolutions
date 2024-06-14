class Solution {
    public int minIncrementForUnique(int[] nums) {
        int c=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>=nums[i+1]){
                while(nums[i]>=nums[i+1]){
                    nums[i+1]+=1;
                    c+=1;
                }
            }
        }
        return c;
    }
}