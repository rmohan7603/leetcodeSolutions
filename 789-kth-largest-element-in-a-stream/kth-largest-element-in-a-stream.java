class KthLargest {
    List<Integer> list;
    int k;
    public KthLargest(int k, int[] nums) {
        list=new ArrayList<>();
        this.k=k;
        for(int i:nums)
        list.add(i);
    }
    
    public int add(int val) {
        list.add(val);
        Collections.sort(list);
        return list.get(list.size()-k);
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */