class Solution {
    private int[][] dir = new int[][]{{-1,0},{1,0},{0,-1},{0,1}};
    void solve(char[][] grid,int m,int n,int i,int j,int[][] vis){
        vis[i][j]=1;
        for(int[] d :dir){
            int r = i+d[0];
            int c = j+d[1];
            if(r>=0 && r<n && c>=0 && c<m && vis[r][c]==0 && grid[r][c]=='1'){
                solve(grid,m,n,r,c,vis);
            }
        }
    }
    public int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int[][] vis = new int[n][m];
        int ans=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]=='1' && vis[i][j]==0){
                    ans++;
                    solve(grid,m,n,i,j,vis);
                }
            }
        }
        return ans;
    }
}
