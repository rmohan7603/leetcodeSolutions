class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int c=0;
        for(int i=0;i<grumpy.length;i++){
            if(grumpy[i]!=1)
            c+=customers[i];
        }
        int d=0,i;
        for(i=0;i<minutes;i++){
            if(grumpy[i]==1)
            d+=customers[i];
        }
        int s=d;
        while(i<grumpy.length){
            if(grumpy[i]==1)
            d+=customers[i];
            if(grumpy[i-minutes]==1)
            d-=customers[i-minutes];
            i+=1;
            s=Math.max(d,s);
        }
        return c+s;
    }
}