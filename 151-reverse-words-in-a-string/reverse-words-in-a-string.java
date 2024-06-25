class Solution {
    public String reverseWords(String s) {
        /* String n=s.replaceAll("\\s+"," ");
        String[] x=n.trim().split(" ");
        String y="";
        for(int i=x.length-1;i>=0;i--){
            y+=x[i];
            if(i!=0){
                y+=" ";
            }
        }
        return y; */
        String y="";
        int i=0;
        while(i<s.length()){
            while(i<s.length() && s.charAt(i)==' ')
            i+=1;
            if(i>=s.length())
            break;
            int j=i+1;
            while(j<s.length() && s.charAt(j)!=' ')
            j+=1;
            String sub=s.substring(i,j);
            if(y.length()==0)
            y+=sub;
            else
            y=sub+" "+y;
            i=j+1;
        }
        return y;
    }
}