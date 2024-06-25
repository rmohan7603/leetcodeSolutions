class Solution {
    public String convertToTitle(int columnNumber) {
        char[] a=new char[26];
        for(int i=0;i<26;i++)
        a[i]=(char)((int)'A'+i);
        if(columnNumber<27)
        return String.valueOf(a[columnNumber-1]);
        List<Integer> x=new ArrayList<>();
        while(columnNumber>26){
            int d=columnNumber%26;
            if(d==0)
            x.add(26);
            else
            x.add(d);
            columnNumber=(columnNumber-1)/26;
        }
        x.add(columnNumber);
        String y="";
        for(int i=x.size()-1;i>=0;i--)
        y+=a[x.get(i)-1];
        return y;
    }
}