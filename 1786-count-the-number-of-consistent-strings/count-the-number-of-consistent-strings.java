class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        boolean[] freqArr=new boolean[26];
        for(char c:allowed.toCharArray())
        freqArr[c-'a']=true;
        int ans=0;
        for(String i:words){
            int j=0;
            for(j=0;j<i.length();j++){
                if(freqArr[i.charAt(j)-'a']==false)
                break;
            }
            if(j==i.length())
            ans+=1;
        }
        return ans;
    }
}