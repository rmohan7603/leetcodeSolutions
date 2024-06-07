class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
        Set<String> y=new HashSet<>(dictionary);
        String[] a=sentence.split(" ");
        String f="";
        for(String x:a){
            String c="";
            for(int i=1;i<=x.length();i++){
                c=x.substring(0,i);
                if(y.contains(c)){
                    break;
                }
            }
            f+=c;
            if(x!=a[a.length-1])
            f+=" ";
        }
        return f;
    }
}