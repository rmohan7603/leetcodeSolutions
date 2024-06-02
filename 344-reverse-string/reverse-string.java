class Solution {
    public void reverseString(char[] s) {
        int i=0,j=s.length-1;
        char a=' ';
        while(i<j){
            a=s[i];
            s[i]=s[j];
            s[j]=a;
            i+=1;
            j-=1;
        }
    }
}