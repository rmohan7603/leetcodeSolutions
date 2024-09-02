class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        int a=0;
        while(chalk[a]<=k){
            k-=chalk[a++];
            if(a==chalk.length)
            a=0;
        }
        return a;
    }
}