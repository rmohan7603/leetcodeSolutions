class Solution {
    public int heightChecker(int[] heights) {
        int h=heights.length,x=0;
        int[] a=new int[h];
        int[] n=new int[101];
        for(int i=0;i<heights.length;i++)
        n[heights[i]]+=1;
        for(int i=0;i<101;i++){
            int j=n[i];
            while(j--!=0){
                a[x++]=i;
            }
        }
        int c=0;
        for(int i=0;i<heights.length;i++){
            if(a[i]!=heights[i])
            c+=1;
        }
        return c;
    }
}