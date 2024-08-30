class Solution {
    public int largestRectangleArea(int[] heights) {
        List<Integer> ind=new ArrayList<>();
        List<Integer> ht=new ArrayList<>();
        int maxArea=0;
        for(int i=0;i<heights.length;i++){
            if(ind.isEmpty()){
                ind.add(i);
                ht.add(heights[i]);
            }
            else{
                int tempInd=i;
                while(!ht.isEmpty() && ht.get(ht.size()-1)>heights[i]){
                    maxArea=Math.max((i-ind.get(ind.size()-1))*ht.get(ht.size()-1),maxArea);
                    tempInd=ind.get(ind.size()-1);
                    ht.remove(ht.size()-1);
                    ind.remove(ind.size()-1);
                }
                ind.add(tempInd);
                ht.add(heights[i]);
            }
        }
        for(int i=0;i<ht.size();i++)
        maxArea=Math.max((heights.length-ind.get(i))*ht.get(i),maxArea);
        return maxArea;
    }
}