class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int[] a=new int[1001];
        int[] b=new int[1001];
        for(int i:nums1)
        a[i]+=1;
        for(int i:nums2)
        b[i]+=1;
        int d=0;
        for(int i=0;i<1001;i++){
            if(a[i]>=1 && b[i]>=1){
                d+=Math.min(a[i],b[i]);
            }
        }
        int[] c=new int[d];
        d=0;
        for(int i=0;i<1001;i++){
            if(a[i]>=1 && b[i]>=1){
                for(int j=0;j<Math.min(a[i],b[i]);j++)
                c[d++]=i;
            }
        }
        return c;
    }
}