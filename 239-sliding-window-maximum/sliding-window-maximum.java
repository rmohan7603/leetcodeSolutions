class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] a=new int[nums.length-k+1];
        int r=0;
        Deque<Integer> x=new ArrayDeque<>();
        for(int i=0;i<nums.length;i++){
            if(!x.isEmpty() && x.peekFirst()<i-k+1)
            x.pollFirst();
            while(!x.isEmpty() && nums[x.peekLast()]<=nums[i])
            x.pollLast();
            x.addLast(i);
            if(i>=k-1){
                a[r++]=nums[x.peek()];
            }
        }
        return a;
    }
}