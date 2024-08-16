class Solution {
    public int maxDistance(List<List<Integer>> arrays) {
        int minVal=arrays.get(0).get(0);
        int maxVal=arrays.get(0).get(arrays.get(0).size()-1);
        int res=0;
        for(int i=1;i<arrays.size();i++){
            int tempRes1=maxVal-arrays.get(i).get(0);
            int tempRes2=arrays.get(i).get(arrays.get(i).size()-1)-minVal;
            res=Math.max(res,(Math.max(tempRes1,tempRes2)));
            minVal=Math.min(minVal,arrays.get(i).get(0));
            maxVal=Math.max(maxVal,arrays.get(i).get(arrays.get(i).size()-1));
        }
        return res;
    }
}