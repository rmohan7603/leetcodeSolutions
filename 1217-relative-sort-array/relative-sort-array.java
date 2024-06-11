class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] a=new int[1001];
        int[] r=new int[arr1.length];
        Set<Integer> y=new HashSet<>();
        for(int i:arr2)
        y.add(i);
        int c=0;
        for(int i:arr1)
        a[i]+=1;
        for(int i:arr2){
            for(int j=0;j<a[i];j++)
            r[c++]=i;
        }
        for(int i=0;i<1001;i++){
            if(!y.contains(i) && a[i]!=0){
                for(int j=0;j<a[i];j++)
                r[c++]=i;
            }
        }
        return r;
    }
}