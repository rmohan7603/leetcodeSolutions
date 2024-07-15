class Solution {
    public String longestCommonPrefix(String[] strs) {
        /*ArrayList<String> x=new ArrayList<String>();
        for(String a:strs){
            x.add(a);
        }
        String s=Collections.min(x);
        String b=Collections.max(x);
        int i=0;
        String n="";
        for(int j=0;j<s.length();j++){
            if(s.charAt(j)==b.charAt(i)){
                n+=s.charAt(j);
            }
            else{
                break;
            }
            i+=1;
        }
        return n;*/
        /*if(strs.length==1)
        return strs[0];
        Arrays.sort(strs);
        String n="";
        for(int i=0;i<strs[0].length();i++){
            if(strs[0].charAt(i)!=strs[strs.length-1].charAt(i))
                return n;
            n+=strs[0].charAt(i);
        }
        return n;*/
        String n="";
        for(int i=0;i<strs[0].length();i++){
            for(String s:strs){
                if(i==s.length() || strs[0].charAt(i)!=s.charAt(i))
                return n;
            }
            n+=strs[0].charAt(i);
        }
        return n;
    }
}