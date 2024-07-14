class Solution {
    public String getSmallestString(String s) {
        String y="";
        List<String> arr=new ArrayList<>();
        for(int i=0;i<s.length()-1;i++){
            int a=(s.charAt(i)-'0')%2;
            int b=(s.charAt(i+1)-'0')%2;
            if(a==b){
                String y1=y;
                y1+=s.charAt(i+1);
                y1+=s.charAt(i);
                if(i+2<s.length()){
                    int j=i+2;
                    while(j<s.length())
                    y1+=s.charAt(j++);
                }
                arr.add(y1);
            }
            y+=s.charAt(i);
        }
        arr.add(s);
        return Collections.min(arr);
    }
}