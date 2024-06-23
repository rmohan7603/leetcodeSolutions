class Solution {
    public int firstMissingPositive(int[] nums) {
        int n=nums.length;
        int[] a=new int[n];
        for(int i:nums){
            if(i>0 && i<=n)
            a[i-1]=1;
        }
        for(int i=0;i<n;i++){
            if(a[i]==0)
            return i+1;
        }
        return n+1;
    }
}