class Solution {
    public String reverseWords(String s) {
        char[] a=s.toCharArray();
        char[] b=new char[a.length+1];
        int j=a.length-1,c=0;
        while(j>=0){
            while(j>0 && a[j]==' ')
            j-=1;
            int i=j-1;
            while(i>=0 && a[i]!=' ')
            i-=1;
            if(a[i+1]==' ')
            break;
            if(c!=0 && i+1>=0)
            b[c++]=' ';
            for(int k=i+1;k<=j;k++)
            b[c++]=a[k];
            j=i-1;
        }
        return new String(b,0,c);
    }
}