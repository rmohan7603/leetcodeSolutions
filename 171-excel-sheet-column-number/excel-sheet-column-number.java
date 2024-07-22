class Solution {
    public int titleToNumber(String columnTitle) {
        String x="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int c=0,d=0;
        double a=26;
        for(int i=columnTitle.length()-1;i>=0;i--){
            double b=d++;
            int y=(int)Math.pow(a,b);
            c+=y*(x.indexOf(columnTitle.charAt(i))+1);
        }
        return c;
    }
}