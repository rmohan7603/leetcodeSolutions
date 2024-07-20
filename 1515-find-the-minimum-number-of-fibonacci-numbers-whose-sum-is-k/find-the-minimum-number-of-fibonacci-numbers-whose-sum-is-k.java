class Solution {
    public int fib(int t){
        int a=0,b=1,c=0;
        while(c<=t){
            c=a+b;
            a=b;
            b=c;
        }
        return a;
    }
    public int findMinFibonacciNumbers(int k) {
        int c=0;
        while(k>0){
            int x=fib(k);
            c+=1;
            k-=x;
        }
        return c;
    }
}