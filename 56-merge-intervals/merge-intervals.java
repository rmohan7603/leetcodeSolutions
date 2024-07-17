class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return a[0] - b[0];
            }
        });
        List<List<Integer>> arr=new ArrayList<>();
        for(int i=0;i<intervals.length;i++){
            if(arr.isEmpty() || arr.get(arr.size()-1).get(1)<intervals[i][0])
            arr.add(Arrays.asList(intervals[i][0],intervals[i][1]));
            else
            arr.get(arr.size()-1).set(1,Math.max(arr.get(arr.size() - 1).get(1), intervals[i][1]));
        }
        int[][] a=new int[arr.size()][2];
        for(int i=0;i<arr.size();i++){
            a[i][0]=arr.get(i).get(0);
            a[i][1]=arr.get(i).get(1);
        }
        return a;
    }
}