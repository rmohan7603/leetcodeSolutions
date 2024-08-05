class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] a=new int[temperatures.length];
        Stack<Integer> stk=new Stack<>();
        for(int currDay=0;currDay<temperatures.length;currDay++){
            while(!stk.isEmpty() && temperatures[stk.peek()]<temperatures[currDay]){
                int prevDay=stk.pop();
                a[prevDay]=currDay-prevDay;
            }
            stk.push(currDay);
        }
        return a;
    }
}