class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        Arrays.sort(hand);
        List<Integer> x=new ArrayList<>();
        for(int i:hand)
        x.add(i);
        if(x.size()%groupSize!=0)
        return false;
        while(x.size()!=0){
            int a=x.get(0);
            for(int i=a;i<a+groupSize;i++){
                if(x.contains(i))
                x.remove(Integer.valueOf(i));
                else
                return false;
                if(x.size()==0 && i!=a+groupSize-1)
                return false;
            }
        }
        return true;
    }
}