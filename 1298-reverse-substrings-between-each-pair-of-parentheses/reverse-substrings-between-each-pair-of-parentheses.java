class Solution {
    public String reverseParentheses(String s) {
        Stack<Character> stk=new Stack<>();
        for(char c:s.toCharArray()){
            if(c=='(')
            stk.push(c);
            else if(c==')'){
                List<Character> a=new ArrayList<>();
                while(!stk.isEmpty() && stk.peek()!='('){
                    a.add(stk.pop());
                }
                stk.pop();
                for(int i=0;i<a.size();i++)
                stk.push(a.get(i));
            }
            else
            stk.push(c);
        }
        String y="";
        while(!stk.isEmpty())
        y=stk.pop()+y;
        return y;
    }
}