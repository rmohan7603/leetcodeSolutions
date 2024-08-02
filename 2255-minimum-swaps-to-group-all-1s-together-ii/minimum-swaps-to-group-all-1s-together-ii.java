class Solution {
    public int minSwaps(int[] nums) {
        int[] a=new int[nums.length*2];
        int c=0,ans=nums.length,d=0;
        for(int i=0;i<a.length;i++){
            if(i<nums.length && nums[i]==1)
            c+=1;
            a[i]=nums[i%nums.length];
        }
        int i=0;
        while(i<c){
            if(nums[i]==0)
            d+=1;
            i+=1;
        }
        ans=Math.min(d,ans);
        while(i<a.length){
            if(a[i]==0)
            d+=1;
            if(a[i-c]==0)
            d-=1;
            ans=Math.min(d,ans);
            i+=1;
        }
        return ans;
    }
}