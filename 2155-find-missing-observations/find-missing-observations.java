class Solution {
    public int[] missingRolls(int[] rolls, int mean, int n) {
        int[] ansArr = new int[n];
        int sum=0;
        for(int i:rolls)
        sum+=i;
        int diffSum=(rolls.length+n)*mean-sum;
        if(diffSum>n*6 || diffSum<n)
        return new int[0];
        int balSum=0,i=0;
        while(balSum<diffSum){
            ansArr[i++]+=1;
            balSum+=1;
            if(i==ansArr.length)
            i=0;
        }
        return ansArr;
    }
}