class Solution {
    public boolean checkValid(int[][] matrix) {
        for(int i=0;i<matrix.length;i++){
            int[] a=new int[matrix.length];
            for(int j=0;j<matrix.length;j++){
                if(a[matrix[i][j]-1]!=0)
                return false;
                a[matrix[i][j]-1]=1;
            }
        }
        for(int i=0;i<matrix.length;i++){
            int[] a=new int[matrix.length];
            for(int j=0;j<matrix.length;j++){
                if(a[matrix[j][i]-1]!=0)
                return false;
                a[matrix[j][i]-1]=1;
            }
        }
        return true;
    }
}