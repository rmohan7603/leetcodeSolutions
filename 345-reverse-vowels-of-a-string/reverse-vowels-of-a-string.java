class Solution {
    public boolean vow(char a){
        if("aeiouAEIOU".contains(String.valueOf(a)))
        return true;
        return false;
    }
    public String reverseVowels(String s) {
        char[] a=s.toCharArray();
        int i=0,j=s.length()-1;
        while(i<j){
            while(i<a.length && !vow(a[i])){
                i+=1;
            }
            while(j>=0 && !vow(a[j])){
                j-=1;
            }
            if(i>=j)
            break;
            char c=a[i];
            a[i]=a[j];
            a[j]=c;
            i+=1;
            j-=1;
        }
        return new String(a);
    }
}