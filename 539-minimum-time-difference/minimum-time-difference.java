class Solution {
    public int findMinDifference(List<String> timePoints) {
        List<Integer> minArr=new ArrayList<>();
        for(int i=0;i<timePoints.size();i++){
            int h=Integer.parseInt(timePoints.get(i).substring(0,2));
            int m=Integer.parseInt(timePoints.get(i).substring(3));
            if(h<12)
            minArr.add((24+h)*60+m);
            minArr.add(h*60+m);
        }
        Collections.sort(minArr);
        System.out.println(minArr);
        int minAns=Integer.MAX_VALUE;
        for(int i=0;i<minArr.size()-1;i++)
        minAns=Math.min(minAns,minArr.get(i+1)-minArr.get(i));
        return minAns;
    }
}