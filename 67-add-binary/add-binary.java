class Solution {
    public String addBinary(String a, String b) {
        String y="";
        char[] p=a.toCharArray();
        char[] q=b.toCharArray();
        int i=p.length-1,j=q.length-1,c=0;
        while(i>=0 && j>=0){
            int m=Character.getNumericValue(p[i]);
            int n=Character.getNumericValue(q[j]);
            int d=m+n+c;
            if(d==1){
                c=0;
            }
            else if(d==2){
                c=1;
                d=0;
            }
            else if(d==3){
                d=1;
                c=1;
            }
            y+=String.valueOf(d);
            i-=1;
            j-=1;
        }
        while(i>=0){
            int m=Character.getNumericValue(p[i]);
            int d=m+c;
            if(d==1){
                c=0;
            }
            else if(d==2){
                c=1;
                d=0;
            }
            else if(d==3){
                d=1;
                c=1;
            }
            y+=String.valueOf(d);
            i-=1;
        }
        while(j>=0){
            int n=Character.getNumericValue(q[j]);
            int d=n+c;
            if(d==1){
                c=0;
            }
            else if(d==2){
                c=1;
                d=0;
            }
            else if(d==3){
                d=1;
                c=1;
            }
            y+=String.valueOf(d);
            j-=1;
        }
        if(c==1)
        y+=String.valueOf(c);
        char[] z=y.toCharArray();
        i=0;
        j=z.length-1;
        while(i<j){
            char s=z[i];
            z[i]=z[j];
            z[j]=s;
            i+=1;
            j-=1;
        }
        return String.valueOf(z);
    }
}