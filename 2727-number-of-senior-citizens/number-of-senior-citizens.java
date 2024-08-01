class Solution {
    public int countSeniors(String[] details) {
        int c=0;
        for(String i:details){
            if(i.charAt(11)-'0'>6 || (i.charAt(11)-'0'==6 && i.charAt(12)-'0'>=1))
            c+=1;
        }
        return c;
    }
}