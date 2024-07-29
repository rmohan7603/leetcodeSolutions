class Solution {
    public boolean canAliceWin(int[] nums) {
        int a=0,b=0,c=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<10)
            a+=nums[i];
            else if(nums[i]>9 && nums[i]<100)
            b+=nums[i];
            else
            c+=nums[i];
        }
        if(a>b+c || b>a+c)
        return true;
        return false;
    }
}