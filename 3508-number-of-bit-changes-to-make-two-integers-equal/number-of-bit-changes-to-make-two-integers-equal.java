class Solution {
    public int minChanges(int n, int k) {
        if(n==k)
        return 0;
        if(n<k)
        return -1;
        int c=0,d=0;
        List<Integer> x=new ArrayList<>();
        while(n!=0){
            x.add(n%2);
            n/=2;
        }
        List<Integer> y=new ArrayList<>();
        while(k!=0){
            y.add(k%2);
            k/=2;
        }
        while(x.size()!=y.size())
        y.add(0);
        for(int i=0;i<x.size();i++){
            if(x.get(i)==y.get(i))
            d+=1;
            else if(x.get(i)==1 && y.get(i)==0)
            c+=1;
        }
        if(c+d==x.size())
        return c;
        return -1;
    }
}