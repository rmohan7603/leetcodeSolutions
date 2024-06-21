class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int c=0;
        for(int i=0;i<grumpy.length;i++){
            if(grumpy[i]!=1)
            c+=customers[i];
        }
        int d=0;
        for(int i=0;i<=grumpy.length-minutes;i++){
            int x=0;
            for(int j=i;j<i+minutes;j++){
                if(grumpy[j]!=0)
                x+=customers[j];
            }
            d=Math.max(d,x);
        }
        return c+d;
    }
}