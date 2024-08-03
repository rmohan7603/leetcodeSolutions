class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        int[] a=new int[1000];
        for(int i:target)
        a[i-1]+=1;
        for(int i:arr)
        a[i-1]-=1;
        for(int i=0;i<1000;i++){
            if(a[i]!=0)
            return false;
        }
        return true;
    }
}