class Solution {
    public int longestSubarray(int[] nums) {
        int maxElement=0,count=0,maxCount=0;
        for(int i:nums)
        maxElement=Math.max(maxElement,i);
        for(int i:nums){
            if(i==maxElement)
            count+=1;
            else{
                maxCount=Math.max(maxCount,count);
                count=0;
            }
        }
        return Math.max(maxCount,count);
    }
}