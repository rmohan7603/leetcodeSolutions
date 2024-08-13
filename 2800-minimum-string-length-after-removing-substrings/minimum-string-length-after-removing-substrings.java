class Solution {
    public int minLength(String s) {
        Stack<Character> stk=new Stack<>();
        for(char c:s.toCharArray()){
            if(stk.isEmpty())
            stk.push(c);
            else{
                if((stk.peek()=='A' && c=='B') || (stk.peek()=='C' && c=='D'))
                stk.pop();
                else
                stk.push(c);
            }
        }
        return stk.size();
    }
}