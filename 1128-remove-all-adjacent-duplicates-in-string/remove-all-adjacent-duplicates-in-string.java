class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> stk=new Stack<>();
        for(char c:s.toCharArray()){
            if(stk.isEmpty())
            stk.push(c);
            else{
                if(stk.peek()==c){
                    while(stk.peek()==c){
                        stk.pop();
                        if(stk.isEmpty())
                        break;
                    }
                    continue;
                }
                else
                stk.push(c);
            }
        }
        String y="";
        for(char c:stk){
            y+=c;
        }
        return y;
    }
}