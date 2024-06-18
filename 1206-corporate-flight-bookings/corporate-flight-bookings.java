class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int[] x=new int[n];
        for(int i=0;i<bookings.length;i++){
            for(int j=bookings[i][0]-1;j<bookings[i][1];j++)
            x[j]+=bookings[i][2];
        }
        return x;
    }
}