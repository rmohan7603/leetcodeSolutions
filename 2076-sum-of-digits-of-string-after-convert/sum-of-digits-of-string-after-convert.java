class Solution {
    public int getLucky(String s, int k) {
        String sum="";
        for(char c:s.toCharArray())
        sum+=c-'a'+1;
        while(sum.length()!=1 && k!=0){
            int temp=0;
            for(char c:sum.toCharArray())
            temp+=c-'0';
            k-=1;
            sum=String.valueOf(temp);
        }
        return Integer.valueOf(sum);
    }
}