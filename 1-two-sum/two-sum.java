class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> x=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int a=target-nums[i];
            if(x.containsKey(a))
            return new int[]{x.get(a),i};
            x.put(nums[i],i);
        }
        return new int[]{};
    }
}