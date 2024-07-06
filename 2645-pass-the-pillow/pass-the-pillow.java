class Solution {
    public int passThePillow(int n, int time) {
        int a=1;
        boolean d=true;
        while(time!=0){
            if(d)
            a+=1;
            else
            a-=1;
            if(a==n)
            d=false;
            if(a==1)
            d=true;
            time-=1;
        }
        return a;
    }
}