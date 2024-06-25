class Solution {
    public String convertToTitle(int columnNumber) {
        String x="";
        while(columnNumber>0){
            int d=(columnNumber-1)%26;
            x+=(char)(d+'A');
            columnNumber=(columnNumber-1)/26;
        }
        char[] a=x.toCharArray();
        int i=0,j=a.length-1;
        while(i<j){
            char c=a[i];
            a[i]=a[j];
            a[j]=c;
            i+=1;
            j-=1;
        }
        return String.valueOf(a);
    }
}