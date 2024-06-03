class Solution {
    public int appendCharacters(String s, String t) {
        if(s.contains(t))
        return 0;
        int i=0,j=0;
        while(i<s.length() && j<t.length()){
            if(s.charAt(i)==t.charAt(j)){
                j+=1;
            }
            i+=1;
        }
        return t.length()-j;
    }
}