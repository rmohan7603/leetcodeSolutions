class Solution {
    public String largestGoodInteger(String num) {
        for(int i=999;i>=111;i-=111){
            if(num.contains(Integer.toString(i))){
                return Integer.toString(i);
            }
        }
        if(num.contains("000"))
        return "000";
        return "";
    }
}