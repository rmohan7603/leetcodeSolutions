class Solution {
    public int calculate(String s) {
        Stack<String> x=new Stack<>();
        String y="",prev="";
        for(char c:s.toCharArray()){
            if(c==' ')
            continue;
            if(Character.isDigit(c))
            y+=c;
            else{
                x.push(y);
                if(prev.equals("*")){
                    int a=Integer.parseInt(x.pop());
                    x.pop();
                    int b=Integer.parseInt(x.pop());
                    x.push(String.valueOf(a*b));
                }
                if(prev.equals("/")){
                    int a=Integer.parseInt(x.pop());
                    x.pop();
                    int b=Integer.parseInt(x.pop());
                    x.push(String.valueOf(b/a));
                }
                x.push(String.valueOf(c));
                prev=String.valueOf(c);
                y="";
            }
        }
        x.push(y);
        if(prev.equals("*")){
            int a=Integer.parseInt(x.pop());
            x.pop();
            int b=Integer.parseInt(x.pop());
            x.push(String.valueOf(a*b));
        }
        if(prev.equals("/")){
            int a=Integer.parseInt(x.pop());
            x.pop();
            int b=Integer.parseInt(x.pop());
            x.push(String.valueOf(b/a));
        }
        if(x.size()==1)
        return Integer.parseInt(x.peek());
        Stack<String> n=new Stack<>();
        while(!x.isEmpty())
        n.push(x.pop());
        System.out.println(n);
        while(n.size()!=1){
            int c=Integer.parseInt(n.pop());
            String t=n.pop();
            int d=Integer.parseInt(n.pop());
            if(t.equals("+")){
                n.push(String.valueOf(c+d));
            }
            if(t.equals("-")){
                n.push(String.valueOf(c-d));
            }
        }
        return Integer.parseInt(n.pop());
    }
}