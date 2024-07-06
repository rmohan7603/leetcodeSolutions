class Solution {
    public void rotate(int[] nums, int k) {
        if(nums.length==1){return;}
        if(k>=nums.length){k=k%nums.length;}
        /* int[] a=new int[nums.length];
        int c=0;
        for(int i=nums.length-k;i<nums.length;i++){
            a[c++]=nums[i];
        }
        for(int i=0;i<nums.length-k;i++){
            a[c++]=nums[i];
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=a[i];
        } */
        int i=0,j=nums.length-1;
        while(i<j){
            int a=nums[i];
            nums[i]=nums[j];
            nums[j]=a;
            i+=1;
            j-=1;
        }
        i=0;j=k-1;
        while(i<j){
            int a=nums[i];
            nums[i]=nums[j];
            nums[j]=a;
            i+=1;
            j-=1;
        }
        i=k;j=nums.length-1;
        while(i<j){
            int a=nums[i];
            nums[i]=nums[j];
            nums[j]=a;
            i+=1;
            j-=1;
        }
    }
}