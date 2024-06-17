class Solution {
    public boolean judgeSquareSum(int c) {
        Set<Integer> x=new HashSet<>();
        for(int i=0;i<=Math.sqrt(c);i++)
        x.add(i*i);
        for(int i=0;i<=Math.sqrt(c);i++){
            if(x.contains((c)-(i*i)))
            return true;
        }
        return false;
    }
}