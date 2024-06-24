class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> x=new ArrayList<>();
        int top=0,bottom=matrix.length-1,left=0,right=matrix[0].length-1;
        while(top<=bottom && left<=right){
            for(int j=left;j<=right;j++)
            x.add(matrix[top][j]);
            top+=1;
            for(int j=top;j<=bottom;j++)
            x.add(matrix[j][right]);
            right-=1;
            if(top<=bottom){
                for(int j=right;j>=left;j--)
                x.add(matrix[bottom][j]);
            }
            bottom-=1;
            if(left<=right){
                for(int j=bottom;j>=top;j--)
                x.add(matrix[j][left]);
            }
            left+=1;
        }
        return x;
    }
}