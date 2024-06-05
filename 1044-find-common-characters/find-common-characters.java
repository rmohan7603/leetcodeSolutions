class Solution {
    public List<String> commonChars(String[] words) {
        int[] a=new int[26];
        for(char c:words[0].toCharArray())
        a[c-'a']+=1;
        for(int i=1;i<words.length;i++){
            int b[]=new int[26];
            for(char c:words[i].toCharArray()){
                b[c-'a']+=1;
            }
            for(int j=0;j<26;j++){
                a[j]=Math.min(a[j],b[j]);
            }
        }
        List<String> x=new ArrayList<>();
        for(int i=0;i<26;i++){
            if(a[i]!=0 && a[i]!=1){
                for(int j=0;j<a[i];j++)
                x.add(String.valueOf((char)(i+'a')));
            }
            else if(a[i]==1){
                x.add(String.valueOf((char)(i+'a')));
            }
        }
        return x;
    }
}