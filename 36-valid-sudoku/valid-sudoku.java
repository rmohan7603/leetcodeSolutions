class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<Character> x=null;
        Set<Character> y=null;
        for(int i=0;i<9;i++){
            x=new HashSet<>();
            y=new HashSet<>();
            for(int j=0;j<9;j++){
                if(board[i][j]!='.'){
                    if(x.contains(board[i][j]))
                    return false;
                    else
                    x.add(board[i][j]);
                }
                if(board[j][i]!='.'){
                    if(y.contains(board[j][i]))
                    return false;
                    else
                    y.add(board[j][i]);
                }
            }
        }
        for(int i=0;i<9;i+=3){
            for(int j=0;j<9;j+=3){
                Set<Character> a=new HashSet<>();
                for(int m=i;m<i+3;m++){
                    for(int n=j;n<j+3;n++){
                        if(board[m][n]!='.'){
                            if(a.contains(board[m][n]))
                            return false;
                            else
                            a.add(board[m][n]);
                        }
                    }
                }
            }
        }
        return true;
    }
}