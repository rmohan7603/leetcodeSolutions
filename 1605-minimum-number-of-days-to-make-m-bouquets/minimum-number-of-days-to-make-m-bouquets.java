class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        long n=(long)m*k;
        if(bloomDay.length<n)
        return -1;
        int i=Integer.MAX_VALUE,j=Integer.MIN_VALUE;
        for(int a:bloomDay){
            i=Math.min(i,a);
            j=Math.max(j,a);
        }
        while(i<=j){
            int mid=(i+j)/2;
            int c=0,y=0;
            for(int a:bloomDay){
                if(a<=mid)
                c+=1;
                else{
                    y+=(c/k);
                    c=0;
                }
            }
            y+=(c/k);
            if(y>=m)
            j=mid-1;
            else
            i=mid+1;
        }
        return i;
    }
}