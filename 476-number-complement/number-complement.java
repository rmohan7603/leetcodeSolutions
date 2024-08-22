class Solution {
    public int findComplement(int num) {
        int a=0,b=0;
        while(num!=0){
            int rem=num%2;
            if(rem==0)
            b+=Math.pow(2,a);
            a+=1;
            num/=2;
        }
        return b;
    }
}