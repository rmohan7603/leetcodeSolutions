class Solution {
    List<Character> stk=new ArrayList<>();
    List<String> ans=new ArrayList<>();
    public void backtrack(int openN, int closedN, List<Character> stk, List<String> ans,int n){
        if(openN==closedN && openN==n){
            String tempAns="";
            for(char c:stk)
            tempAns+=c;
            ans.add(tempAns);
            return;
        }
        if(openN<n){
            stk.add('(');
            backtrack(openN+1,closedN,stk,ans,n);
            stk.remove(stk.size()-1);
        }
        if(closedN<openN){
            stk.add(')');
            backtrack(openN,closedN+1,stk,ans,n);
            stk.remove(stk.size()-1);
        }
    }
    public List<String> generateParenthesis(int n) {
        backtrack(0,0,stk,ans,n);
        return ans;
    }
}