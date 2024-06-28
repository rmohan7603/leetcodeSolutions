class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        /* Map<Integer,Integer> y=new HashMap<>();
        Map<Integer,List<Integer>> m=new TreeMap<>(Collections.reverseOrder());
        int[] a=new int[k];
        int c=0;
        for(int i=0;i<nums.length;i++){
            if(y.containsKey(nums[i])){
                y.put(nums[i],y.get(nums[i])+1);
            }
            else{
                y.put(nums[i],1);
            }
        }
        for(Integer i:y.keySet()){
            if(!m.containsKey(y.get(i))){
                m.put(y.get(i),new ArrayList<>());
            }
            m.get(y.get(i)).add(i);
        }
        for(Integer i:m.keySet()){
            for(Integer j:m.get(i)){
                a[c]=j;
                c+=1;
                if(c==k){
                    break;
                }
            }
            if(c==k){
                break;
            }
        }
        return a; */
        Map<Integer,Integer> y=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        y.put(nums[i],y.getOrDefault(nums[i],0)+1);
        List<Integer> x[]=new ArrayList[nums.length+1];
        for(int i:y.keySet()){
            int a=y.get(i);
            if(x[a]==null)
            x[a]=new ArrayList<>();
            x[a].add(i);
        }
        int[] res=new int[k];
        int c=0;
        for(int i=nums.length;i>=0;i--){
            if(x[i]!=null){
                for(int j:x[i]){
                    res[c++]=j;
                    if(c==k)
                    return res;
                }
            }
        }
        return res;
    }
}