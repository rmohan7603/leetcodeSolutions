class Solution {
    public int longestPalindrome(String s) {
        int[] a=new int[56];
        int d=0,e=0;
        for(char c:s.toCharArray()){
            if(Character.isUpperCase(c)){
                a[c-'A'+26]+=1;
            }
            else{
                a[c-'a']+=1;
            }
        }
        for(int i=0;i<52;i++){
            if(a[i]%2!=0 && a[i]>e){
                d=i;
                e=a[i];
            }
        }
        int l=0;
        for(int i=0;i<52;i++){
            if(a[i]%2!=0 && i!=d){
                l+=a[i]-1;
            }
            else{
                l+=a[i];
            }
        }
        return l;
    }
}