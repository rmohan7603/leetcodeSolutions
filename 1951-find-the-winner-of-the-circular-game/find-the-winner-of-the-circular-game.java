class Solution {
    public int findTheWinner(int n, int k) {
        int[] a=new int[n];
        Arrays.fill(a,1);
        int c=0,d=0,i=0;
        while(c!=n-1){
            d+=1;
            while(a[i]==0){
                i+=1;
                if(i==n)
                i=0;
            }
            if(d==k){
                a[i]=0;
                d=0;
                c+=1;
            }
            i+=1;
            if(i==n)
            i=0;
        }
        for(i=0;i<n;i++){
            if(a[i]==1)
            return i+1;
        }
        return n+1;
    }
}