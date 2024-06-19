class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int i=1,j=0;
        for(int a:piles)
        j=Math.max(j,a);
        while(i<=j){
            int c=0,m=(i+j)/2;
            for(int a:piles)
            c+=Math.ceil((double)a/m);
            if(c<=h){
                j=m-1;
            }
            else
            i=m+1;
        }
        return i;
    }
}