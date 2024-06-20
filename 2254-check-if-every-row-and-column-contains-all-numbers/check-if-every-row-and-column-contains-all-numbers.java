class Solution {
    public boolean checkValid(int[][] matrix) {
        for(int i=0;i<matrix.length;i++){
            HashSet<Integer> x=new HashSet<>();
            for(int j=0;j<matrix.length;j++){
                if(x.contains(matrix[i][j]))
                return false;
                else
                x.add(matrix[i][j]);
            }
        }
        for(int i=0;i<matrix.length;i++){
            HashSet<Integer> x=new HashSet<>();
            for(int j=0;j<matrix.length;j++){
                if(x.contains(matrix[j][i]))
                return false;
                else
                x.add(matrix[j][i]);
            }
        }
        return true;
    }
}