class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> x=new Stack<>();
        for(char c:s.toCharArray()){
            if(c=='#' && !x.isEmpty())
            x.pop();
            else{
                if(c!='#')
                x.push(c);
            }
        }
        Stack<Character> y=new Stack<>();
        for(char c:t.toCharArray()){
            if(c=='#' && !y.isEmpty())
            y.pop();
            else{
                if(c!='#')
                y.push(c);
            }
        }
        return x.equals(y);
    }
}