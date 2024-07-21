class Solution {
    public boolean doesAliceWin(String s) {
        int d=0;
        for(char c:s.toCharArray()){
            if("aeiouAEIOU".contains(String.valueOf(c)))
            d+=1;
        }
        if(d==0)
        return false;
        return true;
    }
}