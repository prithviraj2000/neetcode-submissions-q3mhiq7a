class Solution {
    int[][] dir = new int[][]{{-1,0},{0,-1},{1,0},{0,1}};
    void solve(char[][] grid,int[][]vis,int i,int j){
        vis[i][j]=1;

        for(int[] d:dir){
            int ni = i+ d[0];
            int nj = j+ d[1];
            if(ni>=0 && ni<grid.length && nj>=0 && nj<grid[0].length && grid[ni][nj]=='1'&& vis[ni][nj]!=1){
                solve(grid,vis,ni,nj);
            }
        }
    }
    public int numIslands(char[][] grid) {
        int[][] vis = new int[grid.length][grid[0].length];

        int ans=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]=='1' && vis[i][j]==0){
                    ans++;
                    solve(grid,vis,i,j);
                }
            }
        }
        return ans;
    }
}
