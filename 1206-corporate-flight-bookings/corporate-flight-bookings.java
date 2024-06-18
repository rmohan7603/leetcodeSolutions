class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int[] x=new int[n+1];
        for(int i=0;i<bookings.length;i++){
            x[bookings[i][0]-1]+=bookings[i][2];
            x[bookings[i][1]]-=bookings[i][2];
        }
        int t=0;
        int[] res=new int[n];
        for(int i=0;i<n;i++){
            t+=x[i];
            res[i]=t;
        }
        return res;
    }
}