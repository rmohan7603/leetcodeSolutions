class Solution {
    public boolean isLongPressedName(String name, String typed) {
        if(name.length()>typed.length())
        return false;
        int i=0,j=0;
        while(i<name.length() && j<typed.length()){
            if(name.charAt(i)==typed.charAt(j)){
                i+=1;
                j+=1;
            }
            else{
                if(i>0 && name.charAt(i-1)==typed.charAt(j))
                j+=1;
                else
                return false;
            }
        }
        while(j<typed.length() && name.charAt(i-1)==typed.charAt(j))
        j+=1;
        if(j!=typed.length() || i!=name.length())
        return false;
        return true;
    }
}