class Solution {
    public int romanToInt(String s) {
        int[] a={1,5,10,50,100,500,1000};
        String b="IVXLCDM";
        int i=0,res=0;
        while(i<s.length()-1){
            int c=b.indexOf(s.charAt(i));
            int d=b.indexOf(s.charAt(i+1));
            if(c<d){
                res+=(a[d]-a[c]);
                i=i+2;
            }
            else{
                res+=a[c];
                i+=1;
            }
        }
        if(i!=s.length())
        res+=a[b.indexOf(s.charAt(i))];
        return res;
    }
}