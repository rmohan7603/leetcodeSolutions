class Solution {
    public int findCenter(int[][] edges) {
        int a=edges[0][0];
        if(a==edges[1][0]||a==edges[1][1])
        return a;
        return edges[0][1];
    }
}