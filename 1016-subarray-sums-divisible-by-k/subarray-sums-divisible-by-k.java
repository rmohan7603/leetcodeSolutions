class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int ps=0,c=0;
        Map<Integer,Integer> x=new HashMap<>();
        x.put(0,1);
        for(int i=0;i<nums.length;i++){
            ps+=nums[i];
            int m=ps%k;
            if(m<0)
            m+=k;
            if(x.containsKey(m))
                c+=x.get(m);
            else
            x.put(m,0);
            x.put(m,x.get(m)+1);
        }
        return c;
    }
}