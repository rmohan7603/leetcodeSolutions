class Solution {
    public int bitwiseComplement(int n) {
        if(n==0)
        return 1;
        int a=0,b=0;
        while(n!=0){
            int rem=n%2;
            if(rem==0)
            b+=Math.pow(2,a);
            a+=1;
            n/=2;
        }
        return b;
    }
}