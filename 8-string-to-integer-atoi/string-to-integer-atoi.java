class Solution {
    public int myAtoi(String s) {
        int i=0,c=1,n=0;
        while(i<s.length() && s.charAt(i)==' ')
        i+=1;
        if(i==s.length())
        return 0;
        if(s.charAt(i)=='-'){
            c=-1;
            i+=1;
        }
        else if(s.charAt(i)=='+'){
            i+=1;
        }
        while(i<s.length() && Character.isDigit(s.charAt(i))){
            if(n>Integer.MAX_VALUE/10 || (n==Integer.MAX_VALUE/10 && s.charAt(i)-'0'>Integer.MAX_VALUE%10)){
                if(c==-1)
                return Integer.MIN_VALUE;
                return Integer.MAX_VALUE;
            }
            n=n*10+s.charAt(i)-'0';
            i+=1;
        }
        return n*c;
    }
}