class Solution {
    public int minBitFlips(int start, int goal) {
        int ans=0;
        for(char c:Integer.toBinaryString(start^goal).toCharArray()){
            if(c=='1')
            ans+=1;
        }
        return ans;
    }
}